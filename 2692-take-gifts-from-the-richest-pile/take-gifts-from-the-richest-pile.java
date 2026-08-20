class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            maxheap.add(gifts[i]);
        }
        for(int i=0;i<k;i++){
            long largest = maxheap.poll();
            int sroot = (int) Math.sqrt(largest);
            maxheap.add(sroot);
        }
        long sum = 0;

        while (!maxheap.isEmpty()) {
            sum += maxheap.poll();
        }

        return sum;
    }
}