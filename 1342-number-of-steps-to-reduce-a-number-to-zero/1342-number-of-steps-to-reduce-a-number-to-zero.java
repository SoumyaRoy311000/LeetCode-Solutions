class Solution {
    public int numberOfSteps(int num) {
        return count(num, 0);
    }
    int count(int n, int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return count(n/2, c+1);
        }
        return count(n-1, c+1);
    }
}