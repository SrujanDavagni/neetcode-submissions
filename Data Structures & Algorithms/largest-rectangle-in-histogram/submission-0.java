class Solution {
    public int largestRectangleArea(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++){
            left[i] = -1;
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                left[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i = n - 1; i >= 0; i--){
            right[i] = n;
            while(!st.isEmpty() && height[st.peek()] >= height[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                right[i] = st.peek();
            }
            st.push(i);
        }
        int large = 0;
        for(int i = 0; i < n; i++){
            left[i]++;
            right[i]--;
            large = Math.max(large, height[i] * (right[i] - left[i] + 1));
        }
        return large;
    }
}
