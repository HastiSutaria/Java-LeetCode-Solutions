class Solution {
    public void reverseString(char[] s) {
        int start =0;
        int end = s.length;
        int mid = start + (end-start)/2;
        end--;
        while(start<mid){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}