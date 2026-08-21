class Solution {
    class Pair {
        int first;   
        String second; 

        Pair(int first, String second) {
            this.first = first;
            this.second = second;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> minheap = new PriorityQueue<>(
            (a, b) -> {
                if (a.first == b.first) {
                    return b.second.compareTo(a.second);
                }
                return a.first - b.first;
            }
        );

    HashMap<String, Integer> map = new HashMap<>();
    for(int i=0;i<words.length;i++){
        map.put(words[i], map.getOrDefault(words[i], 0)+1);
    }
    for(Map.Entry<String, Integer> entry : map.entrySet()){
        minheap.add(new Pair(entry.getValue(), entry.getKey()));
        if(minheap.size()>k){
            minheap.poll();
        }
    }
    ArrayList<String> list = new ArrayList<>();
    while(!minheap.isEmpty()){
        list.add(minheap.poll().second);
    }
    Collections.reverse(list);
    return list;
}
}