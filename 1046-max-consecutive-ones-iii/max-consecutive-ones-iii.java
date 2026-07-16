class Solution {
    public int longestOnes(int[] nums, int k) {

        int l = 0;
        int count = 0;      // Window ki length
        int maxCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < nums.length; i++) {

            count++;   // Right pointer aage gaya, window badi ho gayi.

            if (nums[i] == 0)
                zeroCount++;

            
            while (zeroCount > k) {

                // Left se element hata rahe hain
                if (nums[l] == 0)
                    zeroCount--;

                l++;
                count--;      // Window chhoti hui
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}