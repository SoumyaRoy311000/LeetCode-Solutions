class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int num: nums){
            start = Math.max(start, num);
            end = end+num;
        }
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
        for (int num: nums) {
            if(sum+num>mid){
                sum = num;
                pieces+=1;
            }
            else{
                sum+=num;
            }
        }
        return pieces;
    }
}