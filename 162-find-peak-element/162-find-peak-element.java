class Solution {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<end) {
            int mid = start + (end - start) / 2;
                if (nums[mid] > nums[mid + 1]) {
                    //mid is in the decreasing part of the array, hence the answer may be from mid to left
                    end = mid;
                } else if (nums[mid] < nums[mid+1]) {
                    //mid is in the increasing part of the array, hence the answer will be to the right of mid
                    start = mid+1;
                }
        }
        //loop breaks at start==end, hence both start or end returns the answer
        return start;
    }
}