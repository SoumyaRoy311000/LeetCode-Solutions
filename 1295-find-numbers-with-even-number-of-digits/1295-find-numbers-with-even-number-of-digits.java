class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int j: nums){
            int digits = getDigits(j);
            if(checkEven(digits)){
                count++;
            }
        }
        return count;
    }
    
    int getDigits(int j) {
        return (int)(Math.log10(j))+1;
    }
    
    boolean checkEven(int digits){
        return digits%2 ==0;
    }
}