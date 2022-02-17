class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList();
        temp(candidates, 0, target, new ArrayList(), result);
        return result;
        
    }
    private void temp(int[] c, int start, int target, List<Integer> list, List<List<Integer>> result){
        if(target < 0)
            return;
        if(target == 0)
            result.add(new ArrayList(list));
        for(int i = start; i < c.length; i++){
            list.add(c[i]);  
            temp(c,i,target - c[i], list, result); //looking for remaining target 
            list.remove(list.size()-1); // backtracking 
        }
            
        
    }
    }