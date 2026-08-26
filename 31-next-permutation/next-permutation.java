class Solution {    
    public void nextPermutation(int[] nums) {
        boolean k=false;
        int len=nums.length;
        for(int i=len-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1])
            {
                k=true;
                Arrays.sort(nums,i+1,len);
                for(int j=i+1;j<len;j++)
                {
                    if(nums[i]<nums[j])
                    {
                        int temp=nums[i];
                        nums[i]=nums[j];
                        nums[j]=temp;
                        break;

                    }
                }
                // Arrays.sort(nums,i+1,len);
                return;
            }
        } 
        if(k==false)
        {
            int i=0;
            int j=len-1;
            while(i<j)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
        }   
    }
}