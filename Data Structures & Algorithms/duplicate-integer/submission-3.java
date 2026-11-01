class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])) return true;
            hm.put(nums[i],1);
        }
        return false;
    }
}