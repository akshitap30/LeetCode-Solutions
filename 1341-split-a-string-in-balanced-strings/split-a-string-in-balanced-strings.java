class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int l = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L'){
                l++;
            }else{
                l--;
            }
            if(l == 0){
                count++;
            }
        }
        return count;
    }
}