class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        for(int i=1;i<n;i++){
            if((nums[i] ^ nums[i-1]) == 0){
                return true;
            }
        }
        return false;
    }
}