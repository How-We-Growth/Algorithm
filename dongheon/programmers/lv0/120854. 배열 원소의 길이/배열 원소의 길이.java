class Solution {
    public int[] solution(String[] strlist) {
        int[] indexArr = new int[strlist.length];
        
        for(int i=0; i < strlist.length; i++){
            indexArr[i] = strlist[i].length();
        }

        return indexArr;
    }
}