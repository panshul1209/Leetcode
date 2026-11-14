class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int words = 1;
        int left =0;
        int right =0;
        int found;
        while(left<sentence.length())
        { 
            //checking if the first letter matches or not
            if(sentence.charAt(left)==searchWord.charAt(0)){
                right =0;
                found =1;
                while(right<searchWord.length()){
                    if(left>=sentence.length()) return -1;
                    if(sentence.charAt(left)!=searchWord.charAt(right)){
                        found =0;
                        break;
                    }
                    left++;
                    right++;
                }
                //if the word matches we return the words
                if(found==1) return words;
            }
            //taking the left pointer to the next word as only prefix matters
            while(left<sentence.length() && sentence.charAt(left) != ' ') left++;
            left++;
            words++;
        }
        return -1;
    }
}
