class Solution {
    public int minimumRecolors(String blocks, int k) {
        int min=0;
        int minblock;
        int left = 0;
        int right = k-1;
        for(int i = left;i<=right;i++) if(blocks.charAt(i) == 'W') min++;
        minblock = min;
        while(right < blocks.length())
        {
            if(blocks.charAt(left) == 'W') min--;
            left++;
            right++;
            if(right >= blocks.length()) return minblock;
            else if(blocks.charAt(right) == 'W') min++;
            if(minblock > min) minblock = min;
        }
        return minblock;
    }
}
