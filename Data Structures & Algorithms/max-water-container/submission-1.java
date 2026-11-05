class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int i = 0;
        int j = n - 1;
        int curArea = 0;
        int maxArea = 0;
        while(i < j){
            int height = Math.min(heights[i],heights[j]);
            int width = (j - i);
            curArea = height * width;
            maxArea = Math.max(curArea, maxArea);
            if(heights[i] < heights[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return maxArea;
    }
}
