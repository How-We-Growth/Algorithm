import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public long solution(int n, int[] works) {
        // 큰 거부터 내림차순으로 정렬되는 우선순위큐 생성
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < works.length; i++) {
            q.offer(works[i]); //queue in
        }
        
        for (int i = 0; i < n; i++) {
            int max = q.poll(); //queue out

            // 가장 큰 값이 0보다 작으면 탐색 중지
            if (max <= 0)
                break;
            q.offer(max - 1); //queue에서 제일 큰 값 -1
        }
        
        long tired = 0; //야근 지수
        while (!q.isEmpty()) { 
            int k = q.poll();
            // 야근 지수 = 남은 작업들의 제곱
            tired += k * k; 
        }
        
        return tired;
    }    
}