class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1)
            return 0;
        Arrays.sort(intervals, (a1, a2) ->  a1[1]-a2[1]);
        int end = intervals[0][1];
        int count = 0;
        
        for (int i = 1; i < intervals.length; i ++) {
            if (intervals[i][0] < end) {
                end = Math.min(end, intervals[i][1]);
                count ++;
            } else {
                end = intervals[i][1];
            }
        }
        
        return count;
    }
}