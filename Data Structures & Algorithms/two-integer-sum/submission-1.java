class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = nums[i];
            int y = target - x;
            if(hm.containsKey(y)){
                return new int[]{hm.get(y),i};
            }
            hm.put(x,i);
        }
        return new int[]{0,0};
    }
}
