import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int lcmNum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            lcmNum = LCMFunc(lcmNum, arr[i]);
        }

        return lcmNum;
    }

    private static int LCMFunc(int a, int b) {
        return (a * b) / GCDFunc(a, b);
    }
    
    private static int GCDFunc(int a, int b){ //유클리드 호제법을 사용 
          while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

   
}
