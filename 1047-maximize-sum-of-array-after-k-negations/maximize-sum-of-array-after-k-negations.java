class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=0;i<nums.length && k>0;i++){
            if(nums[i]<0){
                nums[i] = -nums[i];
                k--;
            } 
        }
        if (k % 2 == 1) {

            int minIndex = 0;

            for (int i = 1; i < nums.length; i++) {
                if (Math.abs(nums[i]) < Math.abs(nums[minIndex])) {
                    minIndex = i;
                }
            }

            nums[minIndex] = -nums[minIndex];
        }   
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
}