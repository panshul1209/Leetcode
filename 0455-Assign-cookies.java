class Solution {
    public int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        int left =0;
        int right =0;
        Arrays.sort(g);
        Arrays.sort(s);
        if(s[s.length - 1] < g[0]) return 0;
        while(left<g.length && right<s.length){
            if(s[right]>=g[left]) left++;
            right++;
        }
        return left;
    }
}
