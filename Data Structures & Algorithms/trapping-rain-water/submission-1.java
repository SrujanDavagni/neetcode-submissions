class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int leftWall = Integer.MIN_VALUE;
        int rightWall = Integer.MIN_VALUE;
        int res = 0;
        while(left < right){
            leftWall = Math.max(leftWall, height[left]);
            rightWall = Math.max(rightWall, height[right]);
            if(leftWall < rightWall){
                left++;
                leftWall = Math.max(leftWall, height[left]);
                res += leftWall - height[left];
            }
            else{
                right--;
                rightWall = Math.max(rightWall, height[right]);
                res += rightWall - height[right];
            }
        }
        return res;
    }
}
