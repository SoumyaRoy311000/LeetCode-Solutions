class Solution {
    public int search(int[] nums, int target) {
       if(nums.length==1){
            if(nums[0]==target){
                return 0;
            }
            else return -1;
        }
        int start = 0;
        int end = nums.length-1;
        int pivot = findPivot(nums);
        int ans = binarySearch(nums, target, start, pivot);
        if(ans==-1){
            ans = binarySearch(nums, target, pivot+1, end);
        }
        return ans; 
    }
    
    int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid == nums.length-1){
                return mid;
            }
            else {
                if (nums[mid] > nums[mid + 1]) {
                    return mid;
                } else {
                    if (nums[start] <= nums[mid]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
        }
        return -1;
    }
    
    int binarySearch (int[] nums, int target, int start, int end){
        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid]<target){
                start = mid+1;
            } else if (nums[mid]>target) {
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}