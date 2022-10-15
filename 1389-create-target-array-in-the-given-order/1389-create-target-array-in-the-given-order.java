class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int length=nums.length;
        int[] result=new int[length];
        for(int i=0;i<length;i++){
            if(i==index[i]) {
                result[i]=nums[i];
            }
            else{
                                
                int min=Math.min(i,index[i]);
                int max=Math.max(i,index[i]);                
                for(int j=max;j>min;j--){
                    int tmp=result[j];                    
                    result[j]=result[j-1];                    
                }
                result[min]=nums[i];
            }
        }        
        return result;
    }
}