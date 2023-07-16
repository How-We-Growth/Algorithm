
import java.io.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

//*
// 정렬 안쓰고 슬라이딩 윈도우랑 덱만 사용해서 정렬 
// ?

public class Main{
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter로 한 번에 출력 
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //데이터 개수
        int L = Integer.parseInt(st.nextToken()); //최솟값 범위
        st = new StringTokenizer(br.readLine());
        Deque<Node> mydeque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int now = Integer.parseInt(st.nextToken());
            // 새로운 값이 들어 올 때마다 현재 수보다 큰 값을 덱에서 제거 -> 시간 복잡도 줄음
            while (!mydeque.isEmpty() && mydeque.getLast().value > now) {
                mydeque.removeLast();
            }
            mydeque.addLast(new Node(now, i));
            if (mydeque.getFirst().index <= i - L) {
                mydeque.removeFirst();
            }
            bw.write(mydeque.getFirst().value + " ");
        }
        bw.flush();
        bw.close();
    }

    static class Node { //저장할 노드 클래스
        public int value; 
        public int index; //내 위치

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}