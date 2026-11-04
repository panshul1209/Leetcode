class Solution {
    public int maxArea(int[] height) {
        int left =0;
        int right =height.length-1;
        int max = (right-left)*Math.min(height[left],height[right]);
        while(left<=right)
        {
            if(((right-left)*Math.min(height[left],height[right]))>max) max = (right-left)*Math.min(height[left],height[right]);
            if(height[left]<height[right]) left++;
            else right--;
        }
        return max; 
    }
}
