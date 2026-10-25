class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashMap<Character,Integer> mpp = new HashMap<>();
        for(int i=0;i<s.length();i++)mpp.merge(s.charAt(i),1,Integer::sum);
        for(int i=0;i<t.length();i++)
        {
            mpp.computeIfPresent(t.charAt(i),(key, value) -> {
                int newVal = value-1;
                if(newVal == 0 ) return null;
                else return newVal;
            });
        }
        return mpp.isEmpty();
    }
}
