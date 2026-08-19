class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return a[0] - b[0];
                }
                return a[1] - b[1];       
            }
        );
        int[] rowSums = new int[k];

    for (int i = 0; i < mat.length; i++) {
        int sum = 0;

        for (int j = 0; j < mat[i].length; j++) {
            sum += mat[i][j];
        }

        pq.offer(new int[]{sum, i});
    }

    for (int i = 0; i < k; i++) {
            rowSums[i] = pq.poll()[1];
        }
        return rowSums;
 }
}