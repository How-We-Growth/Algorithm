import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
 
class node implements Comparable<node> {
    int targetNode;
    int value;
 
    node(int targetNode, int value) {
        this.targetNode = targetNode;
        this.value = value;
    }
 
    @Override
    public int compareTo(node o) {
        return value - o.value;
    }
 
}
 
public class Main {
    static int N, M;
    static ArrayList<node>[] list; // 인접리스트로 그래프 표현하기.
    static int[] dist; // 최단거리 배열.
    static boolean[] check; // 사용노드인지 확인하는 배열.
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
 
        list = new ArrayList[N+1];
        dist = new int[N + 1];
        check = new boolean[N + 1];
 
        Arrays.fill(dist, Integer.MAX_VALUE);
 
        for (int i = 0; i <= N; i++) {
        	list[i] = new ArrayList<node>();
        }
 
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
 
            list[start].add(new node(end, weight));
        }
 
        st = new StringTokenizer(br.readLine());
        int startIndex = Integer.parseInt(st.nextToken());
        int endIndex = Integer.parseInt(st.nextToken());
 
        bw.write(dijkstra(startIndex, endIndex) + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    public static int dijkstra(int start, int end) {
        PriorityQueue<node> pq = new PriorityQueue<>();
        boolean[] check = new boolean[N + 1];
        pq.offer(new node(start, 0));
        dist[start] = 0;
 
        while (!pq.isEmpty()) {
        	node nowNode = pq.poll();
            int now = nowNode.targetNode;
 
            if (!check[now]) {
                check[now] = true;
                for (node n : list[now]) { 
                    if (dist[n.targetNode] > dist[now] + n.value) {
                        dist[n.targetNode] = dist[now] + n.value;
                        pq.add(new node(n.targetNode, dist[n.targetNode]));
                    }
                }
            }
        }
        return dist[end];
    }
}