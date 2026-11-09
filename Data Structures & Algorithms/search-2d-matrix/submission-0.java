class Solution {
    public int searchArray(int[] array, int target){
        int m = array.length;
        int colLow = 0;
        int colHigh = m - 1;
        while(colLow <= colHigh){
            int colMid = colLow + (colHigh - colLow) / 2;
            if(array[colMid] == target){
                return 1;
            }
            else if(array[colMid] > target){
                colHigh = colMid - 1;
            }
            else{
                colLow = colMid + 1;
            }
        }
        return -1;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int rowLow = 0;
        int rowHigh = n - 1;
        for(int i = 0; i < n; i++){
            int[] array = matrix[i];
            if(searchArray(array, target) == 1){
               return true;
            }
        }
        return false;
    }
}
