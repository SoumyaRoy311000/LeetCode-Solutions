/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int ans = binarySearch(target, mountainArr, peak, true);
        if(ans==-1){
            ans = binarySearch(target, mountainArr, peak, false);
        }
        return ans;
    }
    
    int peakIndexInMountainArray(MountainArray arr){
        int start = 0;
        int end = arr.length()-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr.get(mid)>arr.get(mid+1)){
                end = mid;
            }
            else if(arr.get(mid)<arr.get(mid+1)){
                start = mid+1;
            }
        }
        return start;
    }
    
    int binarySearch(int target, MountainArray arr, int peak, boolean isAsc){
        if(isAsc){
            int start = 0;
            int end = peak;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr.get(mid)<target){
                    start = mid+1;
                }
                else if(arr.get(mid)>target){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        else{
            int start = peak;
            int end = arr.length()-1;
            while(start<=end){
                int mid = start+(end-start)/2;
                if(arr.get(mid)>target){
                    start = mid+1;
                }
                else if(arr.get(mid)<target){
                    end = mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
    }
}