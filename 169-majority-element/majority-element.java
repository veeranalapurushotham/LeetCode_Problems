class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length<2)
        {
            return nums[0];
        }
        int t=nums.length/2;
        Arrays.sort(nums);
        int cnt=1;
        for(int i=1;i<nums.length;i++)
        {
            if(cnt>t)
            {
                return nums[i-1];
            }
            if(nums[i-1]==nums[i])
            {
                cnt++;
            }
            else
            {
                cnt=1;
            }
        }
        return nums[nums.length-1];
    }
}