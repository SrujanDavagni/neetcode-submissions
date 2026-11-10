class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int l = 0;
        int h = n - 1;
        int res = Integer.MAX_VALUE;
        while(l <= h){
            if(nums[l] < nums[h]){
                res = Math.min(res, nums[l]);
                break;
            }
            int m = l + (h - l) / 2;
            res = Math.min(res, nums[m]);
            if(nums[l] <= nums[m]){
                l = m + 1;
            }
            else{
                h = m - 1;
            }
        }
        return res;
    }
}
