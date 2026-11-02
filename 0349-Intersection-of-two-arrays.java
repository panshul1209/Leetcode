class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> mpp = new HashSet<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<nums1.length;i++) mpp.add(nums1[i]);
        for(int i=0;i<nums2.length;i++) 
        {
            if(mpp.contains(nums2[i])) 
            {
                mpp.remove(nums2[i]);
                arr1.add(nums2[i]);
            }
        }
        return arr1.stream().mapToInt(Integer::intValue).toArray();
    }
}
