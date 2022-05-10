class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] charmap = new int[26];
        for(char c: tasks){
            charmap[c-'A']++;
        }
        Arrays.sort(charmap);
        int max=charmap[25]-1;
        int idle_slots = n*max;
        
        for(int i=24; i>=0; i--){
            idle_slots -= Math.min(charmap[i],max);
        }
        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
    }
     
}