class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        boolean[] isOdd = new boolean[m*n];
        for(int[] increments: indices){
            count = getCount(n, count, isOdd, increments);
        }
        return count;
    }

    int getCount(int n, int count, boolean[] isOdd, int[] increments) {
        for(int i = 0; i< isOdd.length; i++){
            count = getCount(n, count, isOdd, increments, i);
        }
        return count;
    }

    int getCount(int n, int count, boolean[] isOdd, int[] increments, int i) {
        if(i >= increments[0]* n && i < increments[0]* n + n){
            if(isOdd[i]){
                isOdd[i] = false;
                count--;
            }
            else{
                isOdd[i] = true;
                count++;
            }
        }
        if(i % n == increments[1]){
            if(isOdd[i]){
                isOdd[i] = false;
                count--;
            }
            else{
                isOdd[i] = true;
                count++;
            }
        }
        return count;
    }
}