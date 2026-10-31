class Solution {
    public int removeDuplicates(int[] nums) {
        int left =0;
        int right=0;
        int k=0;
        while(right<nums.length)
        {
            if(nums[right] != nums[left])
            {
                nums[k++] = nums[left];
                left = right;
            }
            right++;
        }
        nums[k++] = nums[left];
        return k;
    }
}
