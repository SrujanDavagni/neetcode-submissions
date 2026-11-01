class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        int[] schar = new int[26];
        int[] tchar = new int[26];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            schar[ch-'a']++;
        }
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            tchar[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(schar[i] != tchar[i]) return false;
        }
        return true;
    }
}
