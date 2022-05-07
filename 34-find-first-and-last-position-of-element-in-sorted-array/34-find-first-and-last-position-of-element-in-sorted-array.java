class Solution {
public int[] searchRange(int[] nums, int target) {
int[] a={-1,-1};
int startPosition=search(nums,target,true);
int endPosition=search(nums,target,false);
a[0]=startPosition;
a[1]=endPosition;
return a;

}
static int search(int[] nums,int target,boolean b) {
    int ans = -1;

    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;

        if (target > nums[mid]) {
            start = mid + 1;
        } else if (target < nums[mid]) {
            end = mid - 1;
        }
        else {
            ans = mid;
            if (b) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
    }
    return ans;
}
}