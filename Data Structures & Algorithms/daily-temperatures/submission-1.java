class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] res = new int[n];
        Stack<int[]> st = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temp[i] > st.peek()[0]){
                int[] pair = st.pop();
                res[pair[1]] = i - pair[1];
            }
            st.push(new int[]{temp[i],i});
        }
        return res;
    }
}