class Solution {
    public int countPrimes(int n) {
        
     boolean[] isprime = new boolean[n];
     int count = 0;
        
        for(int i = 2; i*i<=n; i++){
            if(!isprime[i]){
                    for(int j = i; i*j<n; j++){
                        isprime[i*j] = true;
                    }
            }
        }
        for(int i=2;i<isprime.length;i++){
            if(!isprime[i]){
                count++;
            }
        }
        return count; 
    }
}