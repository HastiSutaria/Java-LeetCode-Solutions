class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int count=0;
        while(i<=j) {
            if(people[i]==limit) {
                return count + j-i+1;
            } 
            if(people[i]+people[j]<=limit) {
              i++;  
            } 
            j--;
            count++;
        }
        return count;
    }
}