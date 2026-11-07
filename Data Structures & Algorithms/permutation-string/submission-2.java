class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        if(n > m){
            return false;
        }
        int[] ch1 = new int[26];
        for(char ch : s1.toCharArray()){
            ch1[ch - 'a']++;
        }
        int[] ch2 = new int[26];
        int left = 0;
        for(int right = 0; right < m; right++){
            char ch = s2.charAt(right);
            ch2[ch - 'a']++;
            while((right - left + 1) > n){
                ch2[s2.charAt(left) - 'a']--;
                left++;
            }
            if(Arrays.equals(ch1,ch2)) return true;
        }
        return false;
    }
}
