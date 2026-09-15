class Solution {
    public int maxProfit(int[] prices) {
        int min_val = Integer.MAX_VALUE;
        int max = 0;
        for (int i : prices) {
            if (min_val > i) {
                min_val = i;
            } else {
                max = Math.max(max, i - min_val);
            }
        }
        return max;
    }
}