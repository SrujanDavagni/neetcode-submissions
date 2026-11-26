class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int furthest = 0;
        for(int i = 0; i < n; i++){
            furthest = Math.max(furthest, i + nums[i]);
            if(i != n - 1){
                if(nums[i] == 0 && furthest <= i){
                    return false;
                }
            }
        }
        return true;
    }
}
