class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left =0;
        int right = s.length()-1;
        while(left<right)
        {
            if(!Character.isLetter(arr[left]))
            {
                left++;
                continue;
            }
            else if(!Character.isLetter(arr[right]))
            {
                right--;
                continue;
            }
            char temp = arr[right];
            arr[right--] = arr[left];
            arr[left++] = temp;
        }
        return new String(arr);
    }
}
