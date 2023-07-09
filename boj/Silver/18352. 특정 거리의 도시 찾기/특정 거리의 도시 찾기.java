import java.util.*;

public class Main {

    static int visited[]; //방문 거리 저장 배열
    static ArrayList<Integer>[] list; //인접 리스트
    static int N,M,K,X;
    static List<Integer> answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); //노드 개수
        M = sc.nextInt(); //에지 개수
        K = sc.nextInt(); //목표 거리
        X = sc.nextInt(); //시작점
        list = new ArrayList[N + 1];
        answer = new ArrayList();

        for (int i = 1; i <= N; i++) { //N의 개수만큼 반복
            list[i] = new ArrayList<Integer>(); //인접 리시트의 각 List 초기화
        }
        for (int i = 0; i < M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            list[S].add(E);
        }
        visited = new int[N + 1]; //방문 배열 초기화
        for(int i=0;i<=N;i++){
            visited[i]=-1;
        }
        BFS(X);
        for(int i = 0; i <= N; i++){
            if(visited[i] == K) { //방문 거리가 K인 노드의 숫자를 answer에 더함
                answer.add(i);
            }
        }
        if(answer.isEmpty()){ //해당하는 도시가 존재하지 않는다면
            System.out.println("-1");
        }
        else{
            Collections.sort(answer); //배열 오름차순 정렬 출력
            for(int temp:answer){
                System.out.println(temp);
            }
        }
    }

    private static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(node); //큐에 출발노드 더함
        visited[node]++; //방문한 도시에 기록
        while (!queue.isEmpty()) { //큐가 빌 때까지
            int now_node = queue.poll(); //큐에서 노드 데이터를 가져와서
            for (int i : list[now_node]) {
                if (visited[i]==-1) { //현재 노드의 연결 노드 중 방문하지 않은 노드로
                    visited[i] = visited[now_node]+1; //방문 거리 기록
                    queue.add(i); //큐에 데이터 삽입
                }
            }
        }
    }
}