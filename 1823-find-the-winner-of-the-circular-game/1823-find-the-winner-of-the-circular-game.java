class Solution {
    public int findTheWinner(int n, int k) {
        int res = 0;
        for(int i = 1; i < n + 1; i++){
            res = (res + k) % i;
        }
        return res + 1;
    }
}