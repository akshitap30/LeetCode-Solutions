class Solution {
    public String maximumOddBinaryNumber(String s) {
        int ones = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                ones++;
            }
        }
        char[] ans = new char[s.length()];
        // for starting ones
        for(int i=0;i<ones - 1;i++){
            ans[i] = '1';
        }
        // zeroes in the middle
        for(int i=ones - 1;i<s.length()-1;i++){
            ans[i] = '0';
        }
        ans[s.length() - 1] = '1';
        return new String(ans);
    }
}