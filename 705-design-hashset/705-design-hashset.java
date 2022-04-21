class MyHashSet {
int size = (int)Math.pow(10, 6)+1;
	int[] flag;
    public MyHashSet() {
        flag = new int[size];
    }
    
    public void add(int key) {
        flag[key] = 1;
    }
    
    public void remove(int key) {
        flag[key] = 0;
    }
    
    public boolean contains(int key) {
        if(flag[key]==0)
            return false;
        else return true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */