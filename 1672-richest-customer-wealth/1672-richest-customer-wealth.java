class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[]j: accounts){
            int total = totalWealth(j);
            if(max<total){
                max = total;
            }
        }
        return max;
    }
    
    int totalWealth(int[] j) {
        int sum = 0;
        for(int i: j){
            sum+=i;
        }
        return sum;
    }
}