class MyHashMap {
    
    int size = (int)Math.pow(10,6)+1;  // define maximum limit of size of array (according to question constraint)
    Integer[] arr;
    
    public MyHashMap() {
        arr = new Integer[size];  // initialise array of that limit
    }
    
    public void put(int key, int value) {
        arr[key] = value;  // index of array is considered to be 'key' while arr[index] is the 'value'
    }
    
    public int get(int key) {
        if(arr[key]==null)
            return -1;
        return arr[key]; // O(1) time complexity
    }
    
    public void remove(int key) {
        arr[key] = null;  // since array is of Integer type, it can store null also
    }
}