class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> mpp = new HashSet<>();
        for(int i=0;i<nums.length;i++) if(!mpp.add(nums[i])) return true;
        return false;
    }
}
