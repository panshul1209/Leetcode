class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : arr){
            if(n%2==0 && (set.contains(n*2) || set.contains(n/2))) return true;
            else if(set.contains(n*2)) return true;
            set.add(n);
        }
        return false;
    }
}
