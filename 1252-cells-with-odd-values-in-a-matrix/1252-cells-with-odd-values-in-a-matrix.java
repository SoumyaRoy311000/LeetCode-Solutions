class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for(int[] increment: indices){
            function(matrix, increment);
        }
        return countOdd(matrix);
    }
    
    void function(int[][] matrix, int[] increment){
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(increment[0] == i){
                    matrix[i][j]+=1;
                }
                if(increment[1]==j){
                    matrix[i][j]+=1;
                }
            }
        }
    }
    
    int countOdd(int[][] matrix){
        int count = 0;
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                if(matrix[i][j]%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}