public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
         int result = 0;
        
        for (int i = 0; i < 32; i++) {
            //get the first bit
            int firstBit = n & 1;
            //give room for the first bit in result
            result <<= 1;
            //add the bit value to result
            result = result | firstBit;
            //remove the first bit in n
            n >>= 1;
        }
        
        return result;
    }
}