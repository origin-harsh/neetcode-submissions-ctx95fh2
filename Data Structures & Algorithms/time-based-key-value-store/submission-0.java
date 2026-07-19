class TimeMap {
    Map<String, TreeMap<Integer,String>> store;
    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.computeIfAbsent(key, x-> new TreeMap<>()).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        Integer version = (store.containsKey(key)) ? store.get(key).floorKey(timestamp):null;
        return (version != null) ? store.get(key).get(version):"";
    }
}
