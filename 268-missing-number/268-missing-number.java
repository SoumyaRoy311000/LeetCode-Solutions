class Solution {
    public int missingNumber(int[] nums) {
        cyclicSort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=i) {
                return i;
            }
        }
        return nums.length;
    }
    
    void cyclicSort(int[] nums) {
        int i = 0;
        while (i< nums.length){
            int correct = nums[i];
            if(correct== nums.length){
                i++;
            } else if (correct!= i) {
                swap(nums, correct, i);
            }
            else {
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