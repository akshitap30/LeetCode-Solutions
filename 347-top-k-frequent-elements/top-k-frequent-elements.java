class Solution {
    class Pair {
        int first;   
        int second; 

        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        PriorityQueue<Pair> minheap = new PriorityQueue<>((a, b) -> a.first - b.first);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
           minheap.add(new Pair(entry.getValue(), entry.getKey()));
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        
        int[] arr = new int[k];
        int i = 0;

        while (!minheap.isEmpty()) {
            arr[i] = minheap.poll().second;
            i++;
        }
        return arr;
    }
}