class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> subarray_sum = new HashMap<>();
        subarray_sum.put(0,1);
        int sum=0;
        int count=0;
        
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
            if(subarray_sum.containsKey(sum-k)){
                count+=subarray_sum.get(sum-k);
            }
            subarray_sum.put(sum,subarray_sum.getOrDefault(sum,0)+1);
        }
        return count;
    }
}