class Solution {
    public String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int start = 0, end =0;
        for(int i = 0; i<str.length; i++) {
            int even = expandFromIndex(i, i+1, str);
            int odd = expandFromIndex(i, i, str);
            int len = Math.max(even, odd);
            if(len > end - start) {
                start = i - (len-1)/2;
                end = i + (len/2);
            }
        }
        return s.substring(start, end+1);
    }
    
    
    private int expandFromIndex(int l, int r, char[] s) {
        if(s==null || l>r) return 0;
        while(l>=0 && r < s.length && s[l] == s[r]) {
            l--;
            r++;
        }
        return r-l-1;
    }
}