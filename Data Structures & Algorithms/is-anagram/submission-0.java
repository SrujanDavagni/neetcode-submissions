class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(n != m) return false;

        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(s.charAt(i));
        }
        for(int i=0;i<m;i++){
            char ch = t.charAt(i);
            if(!hs.contains(ch)){
                return false;
            }
        }
        return true;
    }
}
