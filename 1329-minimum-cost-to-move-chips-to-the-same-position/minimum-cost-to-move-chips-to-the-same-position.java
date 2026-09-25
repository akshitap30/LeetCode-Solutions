class Solution {
    public int minCostToMoveChips(int[] position) {
        int ceven = 0;
        int codd = 0;
        for(int i=0;i<position.length;i++){
            if(position[i]%2 == 0){
                ceven++;
            }else{
                codd++;
            }
        }
        return Math.min(ceven, codd);
    }
}