class Solution {
    public int firstMissingPositive(int[] nums) {

        int max = 0;

        // Find maximum useful positive number
        for (int i : nums) {
            if (i > 0 && i <= nums.length) {
                max = Math.max(max, i);
            }
        }

        long[] res = new long[max + 1];

        // Store positive numbers
        for (int i : nums) {
            if (i > 0 && i <= max) {
                res[i] = i;
            }
        }

        // Find first missing positive
        for (int i = 1; i < res.length; i++) {
            if (res[i] == 0) {
                return i;
            }
        }

        return max + 1;
    }
}