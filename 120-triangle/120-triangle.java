class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if(j == 1) {
                    dp[i][j] = triangle.get(i - 1).get(j - 1) + dp[i - 1][j];
                } else if (j == i) {
                    dp[i][j] = triangle.get(i - 1).get(j - 1) + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = triangle.get(i - 1).get(j - 1) + Math.min(dp[i - 1][j - 1], dp[i - 1][j]); 
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++) {
            min = Math.min(min, dp[n][i]);
        }
        return min;
    }
}