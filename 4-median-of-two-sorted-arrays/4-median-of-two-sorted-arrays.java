class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length;
        int n = nums2.length;
        
        int start =0;
        int end = m;
        
        while(start<=end){
            int divideNums1 = start+(end-start)/2;
            int divideNums2 = (m+n+1)/2 - divideNums1;
            
            int maxLeftNums1 = divideNums1 == 0 ? Integer.MIN_VALUE : nums1[divideNums1 - 1];
            int minRightNums1 = divideNums1 == m ? Integer.MAX_VALUE : nums1[divideNums1];
            
            int maxLeftNums2 = divideNums2 == 0 ? Integer.MIN_VALUE : nums2[divideNums2 - 1];
            int minRightNums2 = divideNums2 == n ? Integer.MAX_VALUE : nums2[divideNums2];
            
            if (maxLeftNums1 <= minRightNums2 && maxLeftNums2 <= minRightNums1) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftNums1, maxLeftNums2) + Math.min(minRightNums1, minRightNums2)) / 2.0;
                } else {
                    return Math.max(maxLeftNums1, maxLeftNums2);
                }
            }
            else if (maxLeftNums1 > minRightNums2) {
                end = divideNums1 - 1;
            }
            else {
                start = divideNums1 + 1;
            }
        }
        return 0;
    }
}