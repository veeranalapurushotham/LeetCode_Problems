class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int n = cardPoints.length;

        int start = 0;

        // Sum of first k cards
        for (int i = 0; i < k; i++) {
            start += cardPoints[i];
        }

        int ans = start;

        int end = n - 1;

        // Move one card from left to right
        for (int i = k - 1; i >= 0; i--) {

            start -= cardPoints[i];      // Remove one from left
            start += cardPoints[end];    // Add one from right
            end--;

            ans = Math.max(ans, start);
        }

        return ans;
    }
}