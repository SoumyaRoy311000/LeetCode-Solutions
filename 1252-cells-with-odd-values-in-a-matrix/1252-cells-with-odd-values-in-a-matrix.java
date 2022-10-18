class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        boolean[] isOdd = new boolean[m*n];
        for(int[] increments: indices){
            for(int i = 0; i<isOdd.length; i++){
                if(i >= increments[0]*n && i< increments[0]*n+n){
                    if(isOdd[i]){
                    isOdd[i] = false;
                    }
                    else{
                        isOdd[i] = true;
                    }
                }
                if(i%n == increments[1]){
                    if(isOdd[i]){
                    isOdd[i] = false;
                    }
                    else{
                        isOdd[i] = true;
                    }
                }
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