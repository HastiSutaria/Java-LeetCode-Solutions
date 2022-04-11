class Solution {
    public List<List<Integer>> permute(int[] nums) {
         List<Integer> al=new ArrayList<>();
        for(int num:nums){
            al.add(num);
        }
        
        List<List<Integer>> ans=new ArrayList<>();
        permute_(al,ans,new ArrayList<>());
        return ans;
        
    }
    
    public void permute_(List<Integer> al,List<List<Integer>> ans, List<Integer> subAns){
        if(al.size()==0){
            List<Integer> res=new ArrayList<>(subAns);
            ans.add(res);
            return;
        }
        
        for(int i=0;i<al.size();i++){
            subAns.add(al.get(i));
            List<Integer> newList=new ArrayList<>();
            newList.addAll(al.subList(0,i));
            newList.addAll(al.subList(i+1,al.size()));
            permute_(newList,ans,subAns);
            subAns.remove(subAns.size()-1);
        }
    }
}