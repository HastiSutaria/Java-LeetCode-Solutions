class Solution {
   public int climbStairs(int n) {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        int t1=1,t2=2,next=0;
        for(int i=2;i<n;i++){
             next=t1+t2;
            t1=t2;
            t2=next;
        }
        return next;
            
    }

}