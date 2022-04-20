class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        int n=words.length;
        if(pattern.length()!=n)
            return false;
		//Map for mapping character with words eg- a with dog
        Map<Character,String> map=new HashMap<>();
		//Map to check if its already mapped 
        Map<String,Boolean> picked=new HashMap<>();
        for(int i=0;i<n;i++){
            char c=pattern.charAt(i);
			//When character is not mapped with any word
            if(!map.containsKey(c)){
				//If character is not mapped and corresponding/parallel word is already mapped then return false;
                if(picked.get(words[i])!=null && picked.get(words[i]))
                    return false;
				//map character with word and mark word true 
                map.put(c,words[i]);
                picked.put(words[i],true);
            }
            else{
				//if character is mapped  already then check if the corresponding word is same as  mapped word
                if(!map.get(c).equals(words[i]))
                    return false;
            }
        }
        return true;
    }
}