class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0;
        for(int i=0; i<nums.length; i++){
            if(isEven(i)){
                ans[i] = nums[k];
                k++;
            }
            else{
                ans[i] = nums[k+n-1];
            }
        }
        return ans;
    }
    
    boolean isEven(int i){
        return (i%2==0);
    }
}