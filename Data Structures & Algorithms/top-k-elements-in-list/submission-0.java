class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> Integer.compare(b[1],a[1])
        );
        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            int first = entry.getKey();
            int second = entry.getValue();
            pq.offer(new int[]{first,second});
        }
        List<Integer> ls = new ArrayList<>();
        while(k > 0 && !pq.isEmpty()){
            int[] pair = pq.poll();
            ls.add(pair[0]);
            k--;
        }
        int[] res = new int[ls.size()];
        for(int i=0;i<ls.size();i++){
            res[i] = ls.get(i);
        }
        return res;
    }
}
