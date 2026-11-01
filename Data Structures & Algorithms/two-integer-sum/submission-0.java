class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int x = nums[i];
            int y = target - x;
            if(hm.containsKey(y)){
                res[0] = hm.get(y);
                res[1] = i;
            }
            hm.put(x,i);
        }
        return res;
    }
}
