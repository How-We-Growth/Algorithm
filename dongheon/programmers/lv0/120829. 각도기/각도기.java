class Solution {
    public int solution(int angle) {
        
        int result = 0;
        
        int[] arr = {1,2,3,4};
        
        if(angle > 0 && angle < 90){
            result = arr[0];
        }else if(angle == 90){
            result = arr[1];
        }else if(angle > 90 && angle < 180){
            result = arr[2];
        }else if(angle == 180){
            result = arr[3];
        }
        
        return result;
    }
}