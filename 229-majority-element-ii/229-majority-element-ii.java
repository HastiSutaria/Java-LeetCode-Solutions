class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int k = nums.length/3;
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i]) && hm.get(nums[i])>k){
                res.add(nums[i]);
                hm.remove(nums[i]);
            }
        }
        return res;
            
        
    }
}