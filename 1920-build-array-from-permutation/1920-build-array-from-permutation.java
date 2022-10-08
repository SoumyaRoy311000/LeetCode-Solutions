class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            ans[i] = findValue(nums, i);
        }
        return ans;
    }
    
    int findValue(int[] nums, int i){
        int ans_value = nums[nums[i]];
        return ans_value;
    }
}