class Solution {
    public int removeElement(int[] nums, int val) {
       int insInd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[insInd] = nums[i];
                insInd++;
            }
        }
        return insInd;
    }
}