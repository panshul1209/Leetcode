class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int left =0;
        int right =0;
        int counter =0;
        int[] temp = new int[nums.length];
        int index = 0;
        while(right<nums.length)
        {
            if(nums[right] != nums[left])
            {
                left = right;
                counter=0;
            }
            else
            {
                if(counter<k){
                    temp[index++] = nums[right];
                    counter++;
                }
                right++;
            }
        }
        return java.util.Arrays.copyOf(temp, index);
    }
}
