class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i = 0; i< nums.length-1; i++){
            for(int j = i+1; Math.abs(i-j)<=k; j++){
                if(j<nums.length && nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}