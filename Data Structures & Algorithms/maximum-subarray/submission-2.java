class Solution {
    public boolean isNegative(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                return false;
            }
        }
        return true;
    }
    public int maxValue(int[] nums){
        int ans = Integer.MIN_VALUE;
        for(int num : nums){
            ans = Math.max(ans, num);
        }
        return ans;
    }
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if(isNegative(nums)){
            return maxValue(nums);
        }
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        for(int right = 0; right < n; right++){
            curSum += nums[right];
            while(left <= right && curSum < 0){
                curSum -= nums[left];
                left++;
            }
            maxSum = Math.max(maxSum, curSum);
        }
        return maxSum;
    }
}
