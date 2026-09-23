class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        if(sum%3 != 0){
            return false;
        }
        int parts = sum/3;
        int cnt = 0;
        int temp = 0;
        for(int i=0;i<arr.length;i++){
            temp += arr[i];
            if(temp == parts){
                cnt++;
                temp = 0;
            }
        }
        return cnt>=3;
    }
}