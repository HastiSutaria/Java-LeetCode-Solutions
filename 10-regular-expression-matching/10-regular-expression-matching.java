import java.util.regex.*;  
class Solution {
    public boolean isMatch(String s, String p) {
        Pattern p1 = Pattern.compile(p);
        Matcher m = p1.matcher(s);
        boolean b = m.matches();
        return b;
    }
}