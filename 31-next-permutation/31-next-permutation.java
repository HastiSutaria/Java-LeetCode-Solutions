class Solution {
    public void nextPermutation(int[] nums) {
        
        int x=-1;
        
        // Find intuition point
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                x=i;
                break;
            }
        }
        
        if(x==-1){
            // Array in decending order no intuition point
            reverse(nums,x);
            return;
        }else{
            // Find next greator number from last
            for(int i=nums.length-1;i<nums.length;i--){
                if(i!=x && nums[x]<nums[i]){
                   //Swap with next greator number 
                   swap(nums,i,x);
                   break;
                 }
            }
        }
        
        // Reverse array from ip
        reverse(nums,x);
    }
    
    public void reverse(int[] nums, int x){
        for(int i=x+1,j=nums.length-1;i<j;i++,j--){
           swap(nums,i,j);
        }
    }
    
    public void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}