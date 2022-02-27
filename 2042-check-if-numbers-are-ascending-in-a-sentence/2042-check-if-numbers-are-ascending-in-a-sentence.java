class Solution {
    public boolean areNumbersAscending(String s) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
    
    String[] str = s.split(" ");
    
    for(int i = 0 ; i<str.length ; i++)
    {
        if(str[i].charAt(0)>=48 && str[i].charAt(0)<=57)
        {
            arr.add(Integer.parseInt(str[i]));
        }
    }
    
    
    for(int a = 0 ; a<arr.size()-1 ; a++)
    {
        if(arr.get(a)>=arr.get(a+1))
        {
            return false;
        }
    }
    
    
    return true;
    }
}