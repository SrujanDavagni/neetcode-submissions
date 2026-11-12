class Solution {
    public String minWindow(String s, String t) {
        if(s.length() < t.length()){
            return "";
        }
        int n = s.length();
        int[] freq = new int[128];
        for(char ch : t.toCharArray()){
            freq[ch]++;
        }
        int count = t.length();
        int min = Integer.MAX_VALUE;
        int left = 0;
        int start = 0;
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            if(freq[ch] > 0) count--;
            freq[ch]--;
            while(count == 0){
                if(right - left + 1 < min){
                    min = right - left + 1;
                    start = left;
                }
                char lc = s.charAt(left);
                freq[lc]++;
                if(freq[lc] > 0){
                    count++;
                }
                left++;
            }
        }
        return (min == Integer.MAX_VALUE? "" : s.substring(start, start + min));
    }
}
