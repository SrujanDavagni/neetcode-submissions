class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int left = 0;
        int longest = 0;
        int[] chArr = new int[26];
        int maxFreq = 0;
        for(int right = 0; right < n; right++){
            int index = s.charAt(right) - 'A';
            chArr[index]++;
            maxFreq = Math.max(maxFreq, chArr[index]);
            while(left < right && (right - left + 1) - maxFreq > k){
                if(chArr[s.charAt(left) - 'A'] > 0){
                    chArr[s.charAt(left) - 'A']--;
                }
                left++;
            }
            longest = Math.max(longest, (right - left + 1));
        }
        return longest;
    }
}
