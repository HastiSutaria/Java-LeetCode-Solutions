class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int low =0;
        int high = s.length()-1;
        while(low<high){
            if(isVowel(arr[low]) && isVowel(arr[high])){
                char temp = arr[low];
                arr[low]=arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
            else if(!isVowel(arr[low])){
                low++;
            }
            else if(!isVowel(arr[high])){
                high--;
            }
            
        }
        return new String(arr);
        
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);   
        return c=='a' || c=='e'|| c=='i'|| c=='o'|| c=='u';
    }
}