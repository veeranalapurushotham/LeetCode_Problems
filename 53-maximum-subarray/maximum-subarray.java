class Solution {
    public int maxSubArray(int[] nums) {
        int result=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums)
        {
            sum+=i;
            if(sum<=0)
            {
                sum=0;
            }
            result=Math.max(result, sum);
            max= Math.max(max,i);
        }

        if(result==0)
        {
            return max;
        }
        else
        {
            return result;
        }
    }
}