class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatest = new ArrayList();
        int max = findMax(candies);
        int lowerbound = max-extraCandies;
        for(int candy: candies){
            if(candy>=lowerbound){
                greatest.add(true);
            }
            else{
                greatest.add(false);
            }
        }
        return greatest;
    }
    
    int findMax(int[] candies){
        int max = 0;
        for(int i: candies){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}