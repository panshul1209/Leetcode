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

//better sol ( space is less, no extra array used )
class Solution {
    public int[] applyOperations(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) {
                nums[i] *= 2;
                nums[i+1] = 0;
            }
        }
        int j =0;
        for(int i=0;i<nums.length;i++) if(nums[i]!=0) nums[j++] = nums[i];
        while(j<nums.length){
            nums[j++] = 0;
        }
        return nums;
    }
}
