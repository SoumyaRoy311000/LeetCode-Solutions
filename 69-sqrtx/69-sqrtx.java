class Solution {
    public int mySqrt(int x) {
        long start = 0;
        long end = (long)x;
        while(start<=end){
            long mid = start+(end-start)/2;
            if(mid*mid>(long)x){
                end = mid-1;
            } else if (mid*mid<(long)x) {
                start = mid+1;
            }
            else{
                return (int)mid;
            }
        }
        return (int)end;
    }
}