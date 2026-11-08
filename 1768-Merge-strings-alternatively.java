class Solution {
    public String mergeAlternately(String word1, String word2) {
        char []arr = new char[word1.length()+ word2.length()];
        int left=0;
        int right=0;
        int index=0;
        while(left<word1.length() && right<word2.length())
        {
            if(index%2==0) arr[index++] = word1.charAt(left++);
            else arr[index++] = word2.charAt(right++);
        }

        while(left<word1.length()) arr[index++] = word1.charAt(left++);
        while(right<word2.length()) arr[index++] = word2.charAt(right++);

        return new String(arr);
    }
}
