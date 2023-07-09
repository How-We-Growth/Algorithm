import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder()); //내림차순 정렬
        
        String answ = "";
        
        for(String s : str){
           answ += s;
        }
        answer = Long.parseLong(answ);
        
        return answer;
    }
}