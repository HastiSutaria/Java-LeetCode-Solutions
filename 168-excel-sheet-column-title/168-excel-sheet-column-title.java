class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder result = new StringBuilder();
        while(columnNumber > 0){
            char c = (char)('A'+ (columnNumber -1)%26);
            result.append(c);
            columnNumber = (columnNumber -1)/26;
        }
        return result.reverse().toString();
    }
}