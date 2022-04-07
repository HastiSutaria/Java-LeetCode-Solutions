class Solution {
    public int lastStoneWeight(int[] stones) {
        
    ArrayList<Integer> arr = new ArrayList<>();
    
    for(int i=0;i<stones.length;i++){
        arr.add(stones[i]);
    }
    
   while(arr.size()>1){
         
    Collections.sort(arr);
        
        int y = arr.get(arr.size()-1);
        arr.remove(new Integer(y));
        
        int x = arr.get(arr.size()-1);
        arr.remove(new Integer(x));
        
        if(x!=y){
            arr.add(y-x);
        }
    }
    
    if(arr.isEmpty()){
        return 0;
    }else{
        return arr.get(0);
    }
    }
}