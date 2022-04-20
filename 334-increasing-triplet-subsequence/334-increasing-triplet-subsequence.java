class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        
        for( int n : nums){
            if(n <= small1){
                small1 = n;
            }
            else if (n <= small2){
                small2 = n;
            }
            else 
                return true;
        }
        return false;
    }
}