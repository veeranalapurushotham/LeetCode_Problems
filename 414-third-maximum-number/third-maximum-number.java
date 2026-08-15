class Solution {
    public int thirdMax(int[] nums) {
       Arrays.sort(nums);
       int last=nums[nums.length-1];
       int sec=0;
       int third=0;
       if(nums.length<3)
       {
        return last;
       }
       for(int i=nums.length-2;i>=0;i--)
       {
            if(sec==0  )
            {
                if(nums[i]!=last)
                    sec=nums[i];
            }
            else if(sec!=nums[i]){

                return nums[i];
            }

       }
       if(third==0)
        return last;
        else
            return third;
    }
}