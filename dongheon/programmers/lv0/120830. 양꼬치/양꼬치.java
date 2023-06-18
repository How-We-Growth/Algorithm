class Solution {
    public int solution(int n, int k) {
        
        int sheepPrice = 12000;
        int drink = 2000;
        int total = (sheepPrice*n) + (drink*k);
        
        int service = (n/10)*drink;
        
        return total - service;
    }
}