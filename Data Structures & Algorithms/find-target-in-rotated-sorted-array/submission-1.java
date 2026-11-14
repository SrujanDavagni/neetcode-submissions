class Solution {
    public int findPivot(int[] nums, int n){
        int low = 0;
        int high = n - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(nums[mid] > nums[high]){
                low = mid + 1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
    public int search(int[] nums, int target) {
        int n = nums.length;
        int pivot = findPivot(nums, n);
        int low = 0;
        int temp = pivot;
        while(low <= pivot){
            int mid = low + (pivot - low) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                pivot = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        int high = n - 1;
        while(temp <= high){
            int mid = temp + (high - temp) / 2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                high = mid - 1;
            }
            else{
                temp = mid + 1;
            }
        }
        return -1;
    }
}
