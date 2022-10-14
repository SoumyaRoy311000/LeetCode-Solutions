class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] arr : image){
            flip(arr);
        }
        return image;
    }
    
    void flip(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int temp = arr[start]^1;
            arr[start] = arr[end]^1;
            arr[end] = temp;
            start++;
            end--;
        }
    }
}