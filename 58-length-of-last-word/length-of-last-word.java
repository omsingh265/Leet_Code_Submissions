class Solution {
    public int lengthOfLastWord(String s) {

        boolean word_length = false;
        int count = 0;
        for(int i = s.length()-1; i>=0;i--){
            if(s.charAt(i) == ' ' && word_length){
                break;
            }
            else if(s.charAt(i)!=' '){
                word_length = true;
                count++;
            }
        }
        return count;
        
    }
}