class Solution {
    public int[][] merge(int[][] intervals) {
   List<int[]> res= new ArrayList<>();
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        
        int start= intervals[0][0];
        int end= intervals[0][1];
        
        for(int[] i: intervals){ //for every array in intervals
            if(i[0] <= end){               //check if arrays can be merged
                end= Math.max(end,i[1]);    //merge them by changing the 2nd element acc
            }
            else{
                res.add(new int[]{start,end});  //if not, add the last merged arr, and change
                start=i[0];                     //start and end, i.e move to next disjoint arr
                end=i[1];
            }
        }
        res.add(new int[]{start,end});          // add any of the left arrays
        return res.toArray(new int[0][]);
    }
}