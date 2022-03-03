class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int slices =0;
        int count=0;
        for(int i=2; i<nums.length;i++){
            slices += (nums[i]-nums[i-1]==nums[i-1]-nums[i-2]) ? ++count : (count=0);
        }
        return slices;
    }
}