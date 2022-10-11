class Solution {
    public int splitArray(int[] nums, int k) {
        int start = findMax(nums);
        int end = findSum(nums);
        while(start<end){
            int mid = start+(end-start)/2;
            int pieces = findPieces(nums, mid);
            if(pieces<=k){
                end = mid;
            }
            else {
                start = mid+1;
            }
        }
        return start;
    }
    
    int findPieces(int[] nums, int mid) {
        int sum = 0;
        int pieces = 1;
        int i = 0;
        while(i<nums.length) {
            if(sum>mid){
                sum = 0;
                pieces++;
                i = i-1;
            }
            else {
                sum = sum+nums[i];
                i = i+1;
            }
        }
        if(sum>mid){
            return pieces+1;
        }
        return pieces;
    }
    
    int findSum(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum = sum+num;
        }
        return sum;
    }
    
    int findMax(int[] nums) {
        int max = -1;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}