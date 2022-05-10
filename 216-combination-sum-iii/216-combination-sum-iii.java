class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        validCombinations(k,n,1);
        return result;
        
    }
    private void validCombinations(int k, int n, int start){
        if(n==0 && k==0){
            result.add(new ArrayList<>(temp));
            return ;
        }
        for(int i= start; i<10; i++){
            temp.add(i);
            validCombinations(k-1, n-i, i+1);
            temp.remove(temp.size() - 1);
            
        }
    }
}