class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        /* Since we want from 1 to 6 index for  flips */
        
        int countSum[] = new int[7];
        int countA[] = new int[7];
        int countB[] = new int[7];
        
        /*   
             countSum[] will store how many times the swapping takes 
             place for both arrays tops and bottoms.
             if they are equal to any arrays length 
             i.e if countSum[i] == tops.length then only solution can exists
             that indicates that much swaps has been occured at least 
        */
        /*
             countA[] will store swaps require for making top equal
             countB[] will store swaps require for making bottom equal
             and we will return minimum of it
        */     
        
        for(int i = 0; i < tops.length; i++){
            if(tops[i] == bottoms[i]){
                countSum[tops[i]]++;
            }else {
                countSum[tops[i]]++;
                countSum[bottoms[i]]++;
                countA[tops[i]]++;
                countB[bottoms[i]]++;
            }
        }
        
       for(int i = 1; i <= 6; i++) {
            if(countSum[i] == tops.length) 
                return Math.min(countA[i], countB[i]);
        }
        return -1;
    }
}