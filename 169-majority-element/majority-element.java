class Solution {
    public int majorityElement(int[] nums) {
        int last=0;
        int cnt=0;
        for(int i:nums)
        {
            if(cnt==0)
            {
                last=i;
                cnt=1;
                continue;
            }   
            if(last==i)
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        return last;
    }
}