class Solution {
    public int numJewelsInStones(String jewels, String stones) {
       Map<Character, Integer> HashMap_J = new HashMap<>();
        int result=0;
        for(int i=0; i<jewels.length(); i++){
            HashMap_J.put(jewels.charAt(i),HashMap_J.getOrDefault(jewels.charAt(i),0)+1);
            
        }
        for(int j=0; j<stones.length(); j++){
            if(HashMap_J.containsKey(stones.charAt(j)))
                result++;
        }
        return result;
    }
    
}