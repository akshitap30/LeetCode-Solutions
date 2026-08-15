class Solution {
    class Pair {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }
}
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> maxheap = new PriorityQueue<>(
            (a, b) -> {
                if (a.first == b.first)
                    return b.second - a.second;

                return b.first - a.first;
            }
        );
        for(int i=0;i<arr.length;i++){
            maxheap.add(new Pair(Math.abs(arr[i]-x), arr[i]));
            if(maxheap.size()>k){
                maxheap.poll();
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!maxheap.isEmpty()){
            list.add(maxheap.poll().second);
        }
        Collections.sort(list);

        return list;
    }
}