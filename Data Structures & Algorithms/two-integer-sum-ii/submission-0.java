class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while(i <= j){
            int small = nums[i];
            int large = nums[j];
            if(small + large  == target){
                return new int[]{i + 1,j + 1};
            }
            else if(small + large > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }
}
