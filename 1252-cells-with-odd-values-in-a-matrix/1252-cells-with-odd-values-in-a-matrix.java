class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        boolean[] isOdd = new boolean[m*n];
        for(int[] increments: indices){
            for(int i = increments[0]*n; i< increments[0]*n+n; i++){
                if(isOdd[i]){
                    isOdd[i] = false;
                    count--;
                }
                else{
                    isOdd[i] = true;
                    count++;
                }
            }
            for(int i= increments[1]; i<isOdd.length; i=i+n){
                if(isOdd[i]){
                    isOdd[i] = false;
                    count--;
                }
                else{
                    isOdd[i] = true;
                    count++;
                }
            }
        }
        return count;
    }
}