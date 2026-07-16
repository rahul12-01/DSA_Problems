class Solution {
    public int longestSubarray(int[] nums) {

        int st = 0, end = 0, z = 0;

        while (end < nums.length) {
            if (nums[end++] == 0)
                z++;

            if (z > 1) {
                if (nums[st++] == 0)
                    z--;
            }
        }

        return end - st-1;
    }
}
