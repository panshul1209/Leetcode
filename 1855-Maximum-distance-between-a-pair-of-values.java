class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max =0;
        int left =0;
        int right =0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]<=nums2[right]){
                if(right-left>max) max = right-left;
                right++;
            }
            else{
                left++;
                if(left>right) right++;
            }
        }
        return max;
    }
}
