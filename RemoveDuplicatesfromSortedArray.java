class Solution {
    public int removeDuplicates(int[] nums) {
        int output = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[output]) {
                output++;
                nums[output] = nums[i];
            }
        }
        return output + 1;
    }
}
