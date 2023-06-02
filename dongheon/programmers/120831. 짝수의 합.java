class Solution {
    public int solution(int n) {
        
        int sum = 0; // 변수 초기화
        
        for(int i = 1; i <= n; i++){
            if(i%2 == 0){
                sum += i;
            }
        }

        
        return sum;
    }
}