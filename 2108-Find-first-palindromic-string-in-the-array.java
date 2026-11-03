class Solution {
    public String firstPalindrome(String[] words) {
        int i = 0;
        while(i<words.length)
        {
            int left =0;
            int right = words[i].length()-1;
            int found =1;
            while(left<=right)
            {
                if(words[i].charAt(left) != words[i].charAt(right))
                {
                    found =0;
                    break;
                }
                left++;
                right--;
            }
            if(found==1) return words[i];
            i++;
        }
        return "";
    }
}
