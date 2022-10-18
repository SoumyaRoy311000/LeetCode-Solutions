class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count = 0;
        boolean[] isOdd = new boolean[m*n];
        for(int[] increments: indices){
            int elementstartrows = (increments[0])*n;
            int elementendrows = elementstartrows+n-1;
            for(int i = elementstartrows; i<= elementendrows; i++){
                if(isOdd[i]){
                    isOdd[i] = false;
                }
                else{
                    isOdd[i] = true;
                }
            }
            int elementcolumn = increments[1];
            while(elementcolumn<(m*n)){
                if(isOdd[elementcolumn]){
                    isOdd[elementcolumn] = false;
                }
                else{
                    isOdd[elementcolumn] = true;
                }
                elementcolumn+=n;
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