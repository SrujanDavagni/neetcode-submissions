class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int rLow = 0;
        int rHigh = n - 1;
        while(rLow <= rHigh){
            int rMid = rLow + (rHigh - rLow) / 2;
            if(matrix[rMid][0] > target){
                rHigh = rMid - 1;
            }
            else if(matrix[rMid][m - 1] < target){
                rLow = rMid + 1;
            }
            else{
                break;
            }
        }
        if(rLow > rHigh){
            return false;
        }
        int row = rLow + (rHigh - rLow) / 2;
        int low = 0;
        int high = m - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] > target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
