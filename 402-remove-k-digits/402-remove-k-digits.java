class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length() == k)
            return "0";
        StringBuilder temp = new StringBuilder(num);
        for(int i=0; i<k; i++){
            int j=0;
            while(j<temp.length()-1 && temp.charAt(j)<=temp.charAt(j+1)){
                j++;
            }
            temp.delete(j,j+1);
        }
        int i=0;
        while(i<temp.length()-1 && temp.charAt(i)=='0')
            i++;
        return temp.toString().substring(i);
    }
}