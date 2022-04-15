import java.util.*;  
class MyHashMap {
    int arr[];
    public MyHashMap() {
       arr = new int[10000000];
    }
    
    public void put(int key, int value) {
       arr[key]=value+1;
    }
    
    public int get(int key) {
        return arr[key]-1;
    }
    
    public void remove(int key) {
        arr[key]=0;
    }
}