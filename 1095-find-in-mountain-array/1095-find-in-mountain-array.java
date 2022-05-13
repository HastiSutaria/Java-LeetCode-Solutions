/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int start = 0, end = arr.length()-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr.get(mid)>arr.get(mid+1)) end = mid;
            else start = mid+1;
        }
        // the above code block will find me the peak element - start/end is the peak

        int peak = start;
        int firstTry = orderAgnostic(arr, target, 0, peak);     // will search the target in the ascending part
        if(firstTry!=-1) return firstTry;                           // if found, it will return it
        return orderAgnostic(arr, target, peak, arr.length()-1);    // else it will search the target in the descending part
        // the order agnostic function will figure out itself that if it is ascending part or descending part
    }

    int orderAgnostic(MountainArray arr, int target, int start, int end){   // we will provide the start and end indexes to tell it in which area to search in
        boolean isAsc = arr.get(start)<arr.get(end);
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr.get(mid)==target) return mid;
            if(isAsc){
                if(target>arr.get(mid)) start = mid+1;
                else end = mid-1;
            }else{
                if(target>arr.get(mid)) end = mid-1;
                else start = mid+1;
            }
        }
        return -1;
    }
}