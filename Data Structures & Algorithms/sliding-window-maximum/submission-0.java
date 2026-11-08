class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < k; i++){
            pq.offer(nums[i]);
        }
        res[0] = pq.peek();
        int index = 1;
        for(int i = k; i < n; i++){
            if(nums[i - k] == pq.peek()){
                pq.poll();
                pq.offer(nums[i]);
                res[index] = pq.peek();
            }
            else{
                pq.remove(nums[i - k]);
                pq.offer(nums[i]);
                res[index] = pq.peek();
            }
            index++;
        }
        return res;
    }
}
