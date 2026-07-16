import java.util.*;
class Solution {
    int Gcd(int n,int m)
    {
        
        while(m!=0)
        {
            int temp=n%m;
            n=m;
            m=temp;
        }
        return n;
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int[] perGcd=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            max=Math.max(max,nums[i]);
             perGcd[i]=(int) Gcd(nums[i],max);
           
        }
        Arrays.sort(perGcd);
        int i=0;
        int j=perGcd.length-1;
        long sum=0;
        while(i<j)
        {
            sum+=Gcd(perGcd[i],perGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
}