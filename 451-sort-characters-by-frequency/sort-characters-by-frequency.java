class Solution {
    class Pair {
        int first;   
        char second; 

        Pair(int first, char second) {
            this.first = first;
            this.second = second;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Pair> maxheap = new PriorityQueue<>((a, b) -> b.first - a.first);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxheap.add(new Pair(entry.getValue(), entry.getKey()));
        }
        StringBuilder ans = new StringBuilder();
        while (!maxheap.isEmpty()) {
            Pair p = maxheap.poll();
            for (int j = 0; j < p.first; j++) {
                ans.append(p.second);
            }
        }
        return ans.toString();
    }
}