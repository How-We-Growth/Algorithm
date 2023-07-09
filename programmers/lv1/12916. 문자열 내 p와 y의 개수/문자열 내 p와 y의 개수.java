class Solution {
    boolean solution(String s) {
        int p = 0;
        int y = 0;
        boolean answer = true;
        
        // 전부 소문자로 변경
        s = s.toLowerCase();

        // p와 y의 개수 세기
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == 'p')
                p++;
            else if (c == 'y')
                y++;
        }
        
        // 갯수가 같으면true 아니면 false
        answer = p == y ? true : false;

        return answer;
    }
}