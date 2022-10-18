class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        boolean[] isOdd = new boolean[m*n];
        for(int[] increments: indices){
            for(int i = increments[0]*n; i< increments[0]*n+n; i++){
                isOdd[i] = !isOdd[i];
            }
            for(int i = increments[1]; i<isOdd.length; i=i+n){
                isOdd[i] = !isOdd[i];
            }
        }
        for(int i = 0; i<isOdd.length; i++){
            if(isOdd[i]){
                count++;
            }
        }
        return count;
    }
}