class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(a[1],b[1])
        );
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int first = entry.getKey();
            int second = entry.getValue();
            pq.offer(new int[]{first,second});
            if(pq.size() > k){
                pq.poll();
            }
        }
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = pq.poll()[0];
        }
        return res;
    }
}
