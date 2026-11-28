class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        Node(int key, int val){
            this.key = key;
            this.val = val;
            next = null;
            prev = null;
        }
    }

    HashMap<Integer, Node> cache;
    int cap;
    Node head;
    Node tail;
    
    public LRUCache(int capacity) {
        this.cache = new HashMap<>();
        this.cap = capacity;
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }
    
    public void remove(Node node){
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    public void insert(Node node){
        Node prev = this.tail.prev;
        prev.next = node;
        node.prev = prev;
        node.next = this.tail;
        this.tail.prev = node;
    }

    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        insert(newNode);
        if(cache.size() > cap){
            Node lru = this.head.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}
