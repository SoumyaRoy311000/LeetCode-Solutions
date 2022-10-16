class Solution {
    public int numberOfSteps(int num) {
        return counter(num, 0);
    }
    int counter(int n, int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return counter(n/2, c+1);
        }
        return counter(n-1, c+1);
    }
}