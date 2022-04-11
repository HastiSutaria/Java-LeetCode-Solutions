class Solution {
    public List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> res = new ArrayList<>();
        
        // int idx is 1, since the first number is starting from 1
        dfs(res, new LinkedList<>(), n, k, 1);
        
        return res;
    }
    
    private void dfs(List<List<Integer>> res, LinkedList<Integer> record, int n, int k, int idx) {
        
        // end condition
        if (record.size() == k) {
            res.add(new ArrayList<>(record));
            return;
        }
        
        // each loop start from the input idx and increment
        for (int i = idx; i <= n; i++) {
            
            // add to the record
            record.addLast(i);
            
            // backtrack the number greater than the curr number
            dfs(res, record, n, k, i + 1);
            
            // remove the previous result
            record.removeLast();
        }
    }
}