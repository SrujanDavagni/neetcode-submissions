class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashSet<Character> hs = new HashSet<>();
        int left = 0;
        int longest = 0;
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            while(hs.contains(ch)){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(ch);
            longest = Math.max(longest, right - left + 1);
        }
        return longest;
    }
}
