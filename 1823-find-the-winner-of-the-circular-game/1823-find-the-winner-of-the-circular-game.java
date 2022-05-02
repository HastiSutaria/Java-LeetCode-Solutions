class Solution {
    public int findTheWinner(int n, int k) {
        List<Integer> lis = new ArrayList<Integer>();
        for(int i=1; i<=n; i++){
            lis.add(i);
        }
        return helper(lis, k, 0);        
    }
    private int helper(List<Integer> lis, int k, int curr){
        if(lis.size()==1){
            return lis.get(0);
        }
        //int cur = 0;
        curr = (curr+k-1)%lis.size();
        //k=k%lis.size();
        lis.remove(curr);
        return helper(lis, k, curr);        
    }
}