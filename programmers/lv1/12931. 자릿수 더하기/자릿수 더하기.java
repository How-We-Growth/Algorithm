import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String values = Integer.toString(n);
        
        for(int i = 0; i < values.length(); i++){
            answer += Integer.parseInt(values.substring(i,i+1));
        }

        return answer;
    }
}