class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int temp[] =  nums.clone();
        int h=-1;
        int l=-1;
        Arrays.sort(temp);
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=temp[i]){
                l=i;
                break;
            }
        }
        for(int j=nums.length-1; j>=0; j--){
            if(nums[j]!=temp[j]){
                h=j;
                break;
            }
        }
        if(l==h)
            return 0;
        return h-l+1;
        
    }
}