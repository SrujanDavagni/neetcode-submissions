class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n = newS.length();
        int i=0;
        int j=n-1;
        while(i <= j){
            char first = newS.charAt(i);
            char last = newS.charAt(j);
            if(first != last){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
