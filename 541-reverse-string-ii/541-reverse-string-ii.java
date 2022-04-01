class Solution {
    
public String reverseStr(String s, int k) {
	var arr = s.toCharArray();
	for (var i = 0; i < s.length(); i += 2 * k)
		reverse(arr, i, Math.min(i + k, s.length()) - 1);
	return String.valueOf(arr);
}

public void reverse(char[] s, int i, int j) {
	while (i < j) {
		var temp = s[i];
		s[i++] = s[j];
		s[j--] = temp;
	}
}
}
