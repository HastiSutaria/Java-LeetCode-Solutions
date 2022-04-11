class Solution {
    private final int diff = (int)'A' - (int)'a';
    private final int a = (int)'a';
    private final int z = (int)'z';
    private final int A = (int)'A';
    private final int Z = (int)'Z';
    List<String> result;
    char[] chars;
    public List<String> letterCasePermutation(String s) {
        chars = s.toCharArray();
        result = new ArrayList<>();
        dfs(0);
        return result;
    }
    
    public void dfs(int i) {
        if(i == chars.length) {
            result.add(new String(chars));
            return;
        }
        if (Character.isDigit(chars[i])) {
            dfs(i + 1);
        } else {
            chars[i] = toUpper(chars[i]);  
            dfs(i + 1);
            chars[i] = toLower(chars[i]);  
            dfs(i + 1);
        }
    }
    public char toLower(char c) {
        if(c >= A && c <= Z) {
            return (char)(c - diff);
        } else {
            return c;
        }
    }
    public char toUpper(char c) {
        if(c >= A && c <= Z) {
            return c;
        } else {
            return (char)(c + diff);
        }
    }
}