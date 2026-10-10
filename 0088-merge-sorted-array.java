class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0 && n==1) nums1[m] = nums2[0];
        for(int i=0;i<n;i++)
        {
            int temp = m-1;
            while(temp > -1)
            {
                if(nums1[temp] > nums2[i]) 
                {
                    nums1[temp+1] = nums1[temp];
                    temp--;
                }
                else 
                {
                    nums1[temp+1] = nums2[i];
                    break;
                }
            }
            if(temp == -1) nums1[temp +1] = nums2[i];
            m++;
        }
    }
}
