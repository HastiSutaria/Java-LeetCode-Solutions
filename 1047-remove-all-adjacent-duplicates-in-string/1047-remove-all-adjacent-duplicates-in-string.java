class Solution {
    public static String removeDuplicates(String str) 
     {
        int n=str.length();
        char[]res=new char[n];
        int k=0;
         
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(k>0 && res[k-1]==ch) 
              k=k-1;
            else
              res[k++]=ch;
        }
	
        String ans="";
        for(int i=0;i<k;i++) 
          ans+=res[i];
	  
        return ans;
    }
}