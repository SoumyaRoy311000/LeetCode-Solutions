class Solution {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0 , nums.length-1, target);
    }
    int binarySearch(int[] arr, int start, int end, int target){
        int mid = start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]<target){
            return binarySearch(arr, mid+1, end, target);
        }
        else if(arr[mid]>target){
            return binarySearch(arr, start, mid-1, target);
        }
        return mid;
    }
}