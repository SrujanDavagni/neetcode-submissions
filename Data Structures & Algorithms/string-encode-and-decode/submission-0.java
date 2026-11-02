class Solution {
    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length()).append("#").append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>();
        int i = 0;
        int n = str.length();
        while (i < n) {
            int j = str.indexOf("#",i);
            int len = Integer.parseInt(str.substring(i, j));
            String s = str.substring(j + 1, j + 1 + len);
            ls.add(s);
            i = j + 1 + len;
        }
        return ls;
    }
}
