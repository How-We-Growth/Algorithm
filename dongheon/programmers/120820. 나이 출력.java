import java.time.LocalDate;
import java.time.Year;


class Solution {
    public int solution(int age) {
        
        LocalDate today = LocalDate.now();
        int now = today.getYear();
        
        return now-age;
    }
}