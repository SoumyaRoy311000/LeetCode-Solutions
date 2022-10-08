class Solution {
    public int[] twoSum(int[] nums, int target) {
        int found;
        for(int i=0; i<nums.length; i++){
            int pair = target-nums[i];
            found = binarySearch(nums, pair,i);
            if(found==-1){
                continue;
            }
            else{
                return new int[]{i,found};
            }
        }
        return new int[]{0,0};
    }
    
    int binarySearch(int[] nums, int target, int i){
        int start = i+1;
        int end = nums.length-1;
        if(target == nums[start]) return start;
        if(target == nums[end]) return end;
        
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}