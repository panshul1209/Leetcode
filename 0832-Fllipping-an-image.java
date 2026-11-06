class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int index =0;
        while(index<image.length)
        {
            int left =0;
            int right = image[index].length-1;
            while(left<=right)
            {
                if(image[index][left] == image[index][right]) image[index][left] = image[index][right] = 1 - image[index][left];
                left++;
                right--;
            }
            index++;
        }
        return image;
    }
}
