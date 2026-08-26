class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
        int count = 1;
        int lastime = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] >= lastime){
                count = count + 1;
                lastime = intervals[i][1];
            }
        }
        return intervals.length - count;
    }
}