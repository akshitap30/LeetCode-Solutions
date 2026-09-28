class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        int selectedsum = 0;
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int totalsum = 0;
        for(int i=0;i<nums.length;i++){
            totalsum += nums[i];
        }
        for(int i=nums.length - 1;i>=0;i--){
            selectedsum += nums[i];
            totalsum -= nums[i];
            list.add(nums[i]);
            if(selectedsum > totalsum){
                break;
            }
        }
        return list;
    }
}