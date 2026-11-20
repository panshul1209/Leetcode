class Solution {
    public int[] applyOperations(int[] nums) {
        int arr[] = new int[nums.length];
        int index =0;
        int i;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
            if(nums[i] != 0) arr[index++] = nums[i];
        }
        if(nums[i]!=0) arr[index] = nums[i];
        return arr;
    }
}
