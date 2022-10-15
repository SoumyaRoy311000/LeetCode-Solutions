class Solution {
    public boolean checkIfPangram(String sentence) {
        char[] ch = sentence.toCharArray();
        for(char alpha= 'a'; alpha<= 'z'; alpha++){
            if(linearSearch(ch, alpha)==-1){
                return false;
            }
        }
        return true;
    }
    
    int linearSearch(char[] ch, char alpha){
        for(int i = 0; i<ch.length; i++){
            if(ch[i]==alpha){
                return i;
            }
        }
        return -1;
    }
}