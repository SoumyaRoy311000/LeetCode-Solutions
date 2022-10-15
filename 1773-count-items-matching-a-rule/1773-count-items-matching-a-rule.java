class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for(int j = 0; j<items.size(); j++){
            if((items.get(j).get(0).equals(ruleValue) && ruleKey.equals("type"))||(items.get(j).get(1).equals(ruleValue) && ruleKey.equals("color"))||(items.get(j).get(2).equals(ruleValue) && ruleKey.equals("name"))){
                counter++;
            }
        }
        return counter;
    }
}