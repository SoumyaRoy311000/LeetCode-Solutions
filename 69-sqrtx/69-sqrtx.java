class Solution {
    public int mySqrt(int x) {
        long sqrt=0;
        if(x==0){
            return 0;
        }
        if(x==1){
            return 1;
        }
        for(long i = 0; i<=x; i++)
        {
            long square = i*i;
            if(square>x){
                sqrt = i;
                break;
            }
        }
        return (int)sqrt-1;
    }
}