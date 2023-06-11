import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0; 

        HashSet<Integer> reservM = new HashSet<>(); //여벌이 있는 학생 
        HashSet<Integer> lostM = new HashSet<>(); // 잃어버린 학생

        for(int i: reserve) { //[1,3,5]
            reservM.add(i);
        }

        for(int i: lost) { //[2, 4]
            if(reservM.contains(i)) { //여벌이 있는 학생 중 하나라면
                reservM.remove(i); //리스트에서 삭제
            }
            else {
                lostM.add(i); //아니라면 잃어버린 학생 리스트에 추가
            }
        }

        for(int i: reservM) { //여벌 있는 학생들 중에
            if(lostM.contains(i-1)) {  // 잃어버린 학생의 앞 번호가 포함되어 있으면
                lostM.remove(i - 1); // 리스트에서 삭제
            }
            else if(lostM.contains(i+1)) { // 뒷 번호 학생이 있다면
                lostM.remove(i + 1); // 리스트에서 삭제
            }
        }   

        answer = n - lostM.size(); 
        //체육 수업을 들을 수 있는 학생은 전체 학생 수에서 잃어버린 학생 수

        return answer;
    }
    
}