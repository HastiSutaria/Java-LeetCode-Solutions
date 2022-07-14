class Solution {
    public boolean halvesAreAlike(String s) {
        int start =0;
        int end = s.length()-1;
        String v = "aeiouAEIOU";
        int count=0;
        while(start<end){
             if (v.indexOf(s.charAt(start++))>=0)
                 count++;
             if(v.indexOf(s.charAt(end--))>=0)
                count--;
        }
        return count==0;
        
        
        
        
    }
}
