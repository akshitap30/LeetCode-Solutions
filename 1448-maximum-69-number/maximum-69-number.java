class Solution {
    public int maximum69Number (int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];

        for(int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        int maxnum = 0;
        for(int i = 0;i<digits.length;i++){
            if(digits[i] == 6){
                digits[i] = 9;
                break;
            }
        }
        int res = 0;
        for(int digit : digits) {
            res = res * 10 + digit;
        }
        return res;
    }
}