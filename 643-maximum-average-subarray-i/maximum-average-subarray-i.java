class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int sum = 0;
         int r = k;
         for(int i=0;i<k;i++){
            sum += nums[i];
         }
         int maxsum = sum;
         while(r<nums.length){
            sum = sum + nums[r];
            sum = sum - nums[r-k];
            maxsum = Math.max(maxsum, sum);
            r++;
         }
         return (double) maxsum/k;
    }
}