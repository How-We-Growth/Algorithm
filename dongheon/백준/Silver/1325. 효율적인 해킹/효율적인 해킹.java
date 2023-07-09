import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int N, M; //컴퓨터 개수(노드 개수), 신뢰 관계(엣지)
    static boolean visited[]; //방문 유무 기록
    static int answer[];
    static ArrayList<Integer> A[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new ArrayList[N + 1];
        answer = new int[N + 1];

        for (int i = 1; i <= N; i++)
            A[i] = new ArrayList<>(); //인접리스트 초기화
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E); //인접리스트에 그래프 데이터 저장
        }
        for (int i = 1; i <= N; i++) {
            visited = new boolean[N + 1]; //방문 배열초기화
            BFS(i); //모든 노드로 BFS 실행
        }
        int maxVal = 0;
        for (int i = 1; i <= N; i++) {
            maxVal = Math.max(maxVal, answer[i]); //배열에서 가장 큰 수 찾기
        }
        for (int i = 1; i <= N; i++) {
            if (answer[i] == maxVal) //answer배열에서 maxVal와 같은 값을 가진 index를 정답으로 출력
                System.out.print(i + " ");
        }
    }
    public static void BFS(int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index); //큐에 출발 노드 더하기
        visited[index] = true;
        while (!queue.isEmpty()) { //큐가 빌 때까지
            int now_node = queue.poll();
            for (int i : A[now_node]) {
                if (visited[i] == false) {
                    visited[i] = true; //방문 배열에 기록
                    answer[i]++; //신규 노드 인덱스의 정답 배열 값을 증가 시키기 +1
                    queue.add(i);
                }
            }
        }
    }
}