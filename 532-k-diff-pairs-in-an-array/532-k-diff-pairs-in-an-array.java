class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++)
        {  
            int low=i+1;
            int high=nums.length-1;
            while(low<=high)
            {
                int mid=(high+low)/2;
                if(nums[mid]-nums[i]==k)
                {count++;
                 break;
                }else if(nums[mid]-nums[i]>k)
                    high=mid-1;
                else
                    low=mid+1;
            }
            while(i!=nums.length-1 && nums[i+1]==nums[i])
                i++;
        }
        return count;
    }
}