class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int lowerBound = 0;
        int upperBound = arr.length - 1;
        while(lowerBound <= upperBound){
            int mid = lowerBound + (upperBound - lowerBound) / 2;
            if((arr[mid-1] < arr[mid]) && (arr[mid] > arr[mid+1])){
                return mid;
            }
            else if((arr[mid-1] < arr[mid]) && (arr[mid] < arr[mid+1])){
                lowerBound = mid;
            }
            else if((arr[mid-1] > arr[mid]) && (arr[mid] > arr[mid+1])){
                upperBound = mid;
            }
        }
        return 0;
    }
}