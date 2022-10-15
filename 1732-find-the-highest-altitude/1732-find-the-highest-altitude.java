class Solution {
    public int largestAltitude(int[] gain) {
        int altitude = 0;
        int max = 0;
        for(int gains: gain){
            altitude+=gains;
            if(max<altitude){
                max = altitude;
            }
        }
        return max;        
    }
}