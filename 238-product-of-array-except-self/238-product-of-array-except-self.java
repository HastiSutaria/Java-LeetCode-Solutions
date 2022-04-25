class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int left[] = new int[l];
        left[0]=1;
        int right[] = new int[l];
        right[l-1]=1;
        int res[] = new int[l];
        for(int i=1; i<l; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        for(int i=l-2; i>=0; i--){
            right[i] = right[i+1]*nums[i+1];
            
        }
        for(int i=0; i<l; i++){
            res[i] = left[i]*right[i];
        }
            
        return res;
    }
}