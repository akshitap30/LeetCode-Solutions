class Solution {
    public int[] diStringMatch(String s) {
        int[] ans = new int[s.length() + 1];
        int low = 0;
        int high = s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'I'){
                ans[i] = low;
                low++;
            }
            else{
                ans[i] = high;
                high--;
            }
            
        }
        ans[s.length()] = low;
        return ans;
    }
}