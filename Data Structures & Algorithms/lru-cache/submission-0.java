class LRUCache {
    List<int[]> cache;
    int cap;
    public LRUCache(int capacity) {
        cache = new ArrayList<>();
        cap = capacity;
    }
    
    public int get(int key) {
        int n = cache.size();
        for(int i = 0; i < n; i++){
            if(cache.get(i)[0] == key){
                int[] temp = cache.remove(i);
                cache.add(temp);
                return temp[1];
            }
        }
        return -1;
    }
    
    public void put(int key, int value) {
        int n = cache.size();
        for(int i = 0; i < n; i++){
            if(cache.get(i)[0] == key){
                int[] temp = cache.remove(i);
                temp[1] = value;
                cache.add(temp);
                return;
            }
        }
        if(n == cap){
            cache.remove(0);
        }
        cache.add(new int[]{key, value});
    }
}
