class Solution {
     public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        for(int num: nums){
            int n = result.size();
            for(int i=0;i<n;i++){
                List<Integer> temp = new ArrayList<>(result.get(i));
                temp.add(num);
                result.add(temp);
            }
        }
        return result;
    }
}