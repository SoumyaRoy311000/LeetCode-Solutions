class Solution {
    public int findDuplicate(int[] nums) {
        cyclesort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i+1){
                return nums[i];
            }
        }
        return -1;
    }
    
    void cyclesort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[correct]!=arr[i]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }
    
    void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}