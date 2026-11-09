class Solution {
    public String reverseWords(String s) {
        char arr[] = s.toCharArray();
        int left =0;
        int right = 0;
        int index=0;
        while(right<s.length())
        {
            while(right+1<s.length() && arr[right+1]!=' ')
            {
                index++;
                right++;
            }
            while(left<=right)
            {
                char temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                right--;
                left++;
            }
            index += 2;
            right =index;
            left=index;
        }
        return new String(arr);
    }
}
