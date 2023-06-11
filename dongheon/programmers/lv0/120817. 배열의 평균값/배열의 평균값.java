class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        double item = numbers.length;
        
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        
        return sum/item;
    }
}