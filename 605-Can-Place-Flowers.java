//syntax can be really short but the logic is same

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i=0;i<flowerbed.length;i++){
            if(i==0) {
                if(flowerbed[0]==0 && 1<flowerbed.length && flowerbed[1]==0 ){
                    flowerbed[0]=1;
                    n--;
                }
                else if(flowerbed.length==1 && flowerbed[0]==0) {
                    flowerbed[0]=1;
                    n--;
                }
            }
            else if(i==flowerbed.length-1){
                if(flowerbed[i]==0 && flowerbed[i-1]==0){
                    flowerbed[0]=1;
                    n--;
                }
            }
            else if(flowerbed[i-1]==0 && flowerbed[i+1]==0 && flowerbed[i]!=1) {
                flowerbed[i] =1;
                n--;
            }
            if(n<=0) return true;
        }
        return false;
    }
}
