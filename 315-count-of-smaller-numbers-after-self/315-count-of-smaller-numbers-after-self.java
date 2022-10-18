class Solution {
    public List<Integer> countSmaller(int[] nums) {
        
        int n = nums.length;

        List<Integer> clone = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int num: nums) clone.add(num);
        
        Collections.sort(clone);
        
        for(int i=0;i<n;i++){
            int position = binarySearch(clone,nums[i]);
            ans.add(position);
            clone.remove(position);
        }
        
        return ans;
        
    }
    
    public int binarySearch(List<Integer> clone, int target){
        int start=0;
        int end = clone.size();
        
        while(start<end){
            int mid =  start + (end-start)/2;
            if(clone.get(mid)<target){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        
        return start;
    }
}