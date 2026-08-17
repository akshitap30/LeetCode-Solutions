class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxh = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                b[0] * b[0] + b[1] * b[1],
                a[0] * a[0] + a[1] * a[1]
            )
        );

        for(int i=0;i<points.length;i++){ 
            maxh.add(points[i]);
            if(maxh.size()>k){
                maxh.poll();
            }
        }
        int[][] result = new int[k][2];
        for(int i=0;i<k;i++){
            result[i] = maxh.poll();
        }
        return result;
    }
}