class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] sol = new int[nums.length];
        int i=0,j=nums.length-1;
        for (int k=sol.length-1;k>=0;k--){
            if (Math.abs(nums[i])>Math.abs(nums[j])){
                sol[k] = nums[i]*nums[i];
                i++;
            }else {
                sol[k] = nums[j]*nums[j];
                j--;
            }
        }
        return sol;
    }
}