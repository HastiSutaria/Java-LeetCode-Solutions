class Solution {
    public List<Integer> majorityElement(int[] nums) {
         List<Integer> result = new ArrayList<Integer>();
        
        int count1 = 0, count2 = 0, element1 = 0, element2 = 0;
        for (int num: nums) {
            if (num == element1) {
                count1++;
            } else if (num == element2) {
                count2++;
            } else if (count1 == 0) {
                count1 ++;
                element1 = num;
            } else if (count2 == 0) {
                count2 ++;
                element2 = num;
            } else {
                count1 --;
                count2 --;
            }
        }
        
        count1 = count2 = 0;
        for (int num: nums) {
            if (num == element1) count1+=1;
            else if (num == element2) count2+=1;
        }
        
        if (count1 > nums.length / 3) result.add(element1);
        if (count2 > nums.length / 3) result.add(element2);
        return result;
        
    }
}