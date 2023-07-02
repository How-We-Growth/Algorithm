import java.util.*;

class Solution {
    public long solution(long n) {
        if(Math.pow((int)Math.sqrt(n),2) == n){ //n의 제곱근을 제곱하여 n과 같다면
            return (long)Math.pow(Math.sqrt(n)+1, 2); //n+1을 제곱하여 return
        }
        return -1; //같지 않으면 -1
    }
}