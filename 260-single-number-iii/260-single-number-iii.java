class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
         int res[]=new int[2];
        int n=0;
        for(int i =0; i< nums.length; i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],1);
            }
            else{
                int freq = hm.get(nums[i]);
                hm.put(nums[i],freq+1);
            }
        }
       
        for(int i:hm.keySet())
        {
            if(hm.get(i)==1)
            {
                res[n++]=i;
            }
        }
        return res;
        
    }
}

