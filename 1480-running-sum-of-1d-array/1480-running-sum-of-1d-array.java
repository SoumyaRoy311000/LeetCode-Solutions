class Solution {
    public int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            runningSum[i] = totalSum(nums, i);
        }
        return runningSum;
    }
    
    int totalSum(int[] nums, int i){
        int sum = 0;
        if(i == 0){
            sum = nums[0];
        }
        else{
            sum+=totalSum(nums, i-1)+nums[i];
        }
        return sum;
    }
}