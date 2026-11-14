class TimeMap {
    private HashMap<String, List<Pair<Integer, String>>> hm;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!hm.containsKey(key)){
            hm.put(key, new ArrayList<>());
        }
        hm.get(key).add(new Pair<>(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        List<Pair<Integer, String>> ls = hm.get(key);
        if(ls == null){
            return "";
        }
        int low = 0;
        int high = ls.size() - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(ls.get(mid).getKey() > timestamp){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        if(high < 0){
            return "";
        }
        return ls.get(high).getValue();
    }
}
