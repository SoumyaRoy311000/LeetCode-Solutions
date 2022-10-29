class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int zero = 0;
        int first = 1;
        int sum = 0;
        for(int i = 1; i<n; i++){
            sum = zero+first;
            zero = first;
            first = sum;
        }
        return sum;
    }
}