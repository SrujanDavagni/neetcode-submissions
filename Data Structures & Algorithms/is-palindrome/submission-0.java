class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]","");
        StringBuilder sb = new StringBuilder(newS);
        sb.reverse();
        return newS.equalsIgnoreCase(sb.toString());
    }
}
