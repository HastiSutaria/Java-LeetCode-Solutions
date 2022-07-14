class Solution {
    public String toLowerCase(String s) {
        char[] temp = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(temp[i] >= 'A' && temp[i] <= 'Z'){
                temp[i] = (char)(temp[i]+32); 
            }
            
        }
        return new String(temp);
    }
}