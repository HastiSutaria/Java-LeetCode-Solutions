class Solution {
   public List<Integer> getRow(int rowIndex) {
        List<Integer>result=new ArrayList<>();
        int n= rowIndex;
        long first=1;
        result.add((int)first);
        for(int r=1;r<=n;r++){
            long second=((first*(n-r+1))/r);
            result.add((int)second);
            first=second;
        }
        return result;
    }
}
