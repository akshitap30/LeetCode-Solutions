class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxheap.add(stones[i]);
        }
        while(maxheap.size()>=2){
            int first = maxheap.peek();
            maxheap.poll();
            int second = maxheap.peek();
            maxheap.poll();
            maxheap.add(first - second);
        }
        return maxheap.isEmpty() ? 0 : maxheap.peek();
    }
}