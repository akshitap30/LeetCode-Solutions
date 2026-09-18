class Solution {
    public int minDeletions(String s) {
        int[] frequency = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch]++;
        }
        int deletions = 0;
        Set<Integer> used = new HashSet<>();
        for(int freq : frequency){
        while(freq>0 && used.contains(freq)){
            freq--;
            deletions++;
        }
        if(freq>0){
            used.add(freq);
        }
        }
        return deletions;
    }
}