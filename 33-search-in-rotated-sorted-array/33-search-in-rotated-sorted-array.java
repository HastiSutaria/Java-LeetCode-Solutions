class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
		
        while (left < right) {
            int mid = left + (right - left) / 2;
			// Finding the pivot point by moving left to the pivot
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int start = left;
        left = 0;
        right = nums.length - 1;

		// if target is between the pivot and the end of array
        if (nums[start] <= target && nums[right] >= target) {
            left = start;
		//	if target is between 0 and pivot
        } else {
            right = start;
        }
		
		// Normal Binary Search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}