class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int right = 0;
        int sum = 0;
        while (right < nums.length) {
            sum += nums[right];
             if (max < sum) {
                max = sum;
            }
            if (sum < 0) {
                max=Math.max(sum,max);
                sum=0;
            }

           
            
            right++;

        }
        // if(sum==0)
        // {

        //     return min;
        // }
        return max;
    }
}