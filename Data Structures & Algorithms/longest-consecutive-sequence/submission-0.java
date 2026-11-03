class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }

        int longest = 0;
        for(int num : hs){
            if(!hs.contains(num-1)){
                int curStr = 1;
                int curNum = num;
                while(hs.contains(curNum+1)){
                    curNum++;
                    curStr++;
                }
                longest = Math.max(longest,curStr);
            }
        }
        return longest;
    }
}
