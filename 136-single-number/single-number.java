class Solution {
    public int singleNumber(int[] nums) {
        int count=0;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     if(nums[i]!=nums[i+1])
        //     {
        //         if(count==0)
        //         {
        //             return nums[i];
        //         }
        //         else
        //         {
        //             count=0;
        //             continue;
        //         }
        //     }
        //     else
        //     {
        //         count++;
        //     }
        // }
        // return nums[nums.length-1];
        for(int i:nums)
        {
            count^=i;
        }
        return count;
    }
}