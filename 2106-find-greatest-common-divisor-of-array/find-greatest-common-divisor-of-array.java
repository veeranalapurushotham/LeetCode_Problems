class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i: nums)
        {
            min=Math.min(min,i);
            max=Math.max(max,i);
        }
        while(min!=0)
        {
            int temp=min;
            min=max%min;
            max=temp;
        }
        return max;
    }
}