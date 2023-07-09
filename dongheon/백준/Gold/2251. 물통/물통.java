import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int[] Sender = { 0, 0, 1, 1, 2, 2 };
    static int[] Receiver = { 1, 2, 0, 2, 0, 1 };
    static boolean visited[][];  //2개의 무게만 있으면 나머지 하나 무게는 고정이라서 2개로만 체크한다
    static boolean answer[];
    static int now[];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        now = new int[3]; // A B C 물의 양을 저장하는 배열
        now[0] = scan.nextInt();
        now[1] = scan.nextInt();
        now[2] = scan.nextInt();
        visited = new boolean[201][201];
        answer = new boolean[201];
        BFS();
        for (int i = 0; i < answer.length; i++) {
            if (answer[i]) System.out.print(i + " "); //값이 true인 index를 정답으로 출력
        }
    }
    public static void BFS() {
        Queue<AB> queue = new LinkedList<>();
        queue.add(new AB(0, 0)); //처음 물통 배열은 0,0,10인 상태이므로 A와 B는 0,0으로 시작
        visited[0][0] = true; //노드 방문 기록
        answer[now[2]] = true; //현재 C물통의 양 체크
        while (!queue.isEmpty()) {
            AB p = queue.poll(); //노드 데이터를 큐에 가져와서
            int A = p.A; //초기화
            int B = p.B;
            int C = now[2] - A - B; // C는 전체 물의 양에서 A와 B를 뺀 값
            for (int k = 0; k < 6; k++) { // A->B, A->C, B->A, B->C, C->A, C->B 6개의 케이스 반복
                int[] next = { A, B, C };
                next[Receiver[k]] += next[Sender[k]]; //받는 물통에 보내려는 물통 값 더하기
                next[Sender[k]] = 0; //보낸 물통은 0으로 업데이트
                if (next[Receiver[k]] > now[Receiver[k]]) { //물이 넘치면
                    next[Sender[k]] = next[Receiver[k]] - now[Receiver[k]]; //넘치는 만큼 이전 물통에 다시 넣어줌
                    next[Receiver[k]] = now[Receiver[k]]; // 대상 물통은 최대로 채워줌
                }
                if (!visited[next[0]][next[1]]) { // A와 B의 물의 양을 통하여 방문 배열 체크
                    visited[next[0]][next[1]] = true;
                    queue.add(new AB(next[0], next[1]));
                    if (next[0] == 0) {  // A의 물의 양이 0일때 C의 물통의 값을 answer에 저장
                        answer[next[2]] = true;
                    }
                }
            }
        }
    }
}
class AB {
    int A;
    int B;
    public AB(int A, int B) {
        this.A = A;
        this.B = B;
    }
}