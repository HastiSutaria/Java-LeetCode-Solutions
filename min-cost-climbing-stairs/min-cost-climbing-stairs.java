class Solution {
  public int minCostClimbingStairs(int[] cost) {
    int prev = 0, curr = 0, best = 0;
    for (var step: cost) {
      prev = curr;
      curr = step + best;
      best = Math.min(prev, curr);
    }
    return best;
  }
}