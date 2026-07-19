class Solution {
    public boolean canEat(int[] piles,int mid,int h){
        int actualEat = 0;
        for(int p : piles){
            actualEat += p/mid;
            if(p%mid != 0){
                actualEat++;
            }
        }
        return actualEat <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int l = 1;
        int max = piles[0];
        for(int i=0;i<n;i++){
            if(max < piles[i]){
                max = piles[i];
            }
        }
        int r = max;
        while(l<r){
            int mid = l +(r-l)/2;
            if(canEat(piles,mid,h)){
                r = mid;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
}