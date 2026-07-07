class Solution {
    public long sumAndMultiply(int n) {
        String s=String.valueOf(n);
        boolean c=false;
        long sum=0;
        long sumof=0;
        for(char i: s.toCharArray())
        {
            if(i=='0')
            { 
                c=true;
                continue;
            }
            else
            {
                sum=sum*10+(i-'0');
                sumof=sumof+(i-'0');
            }
        }
        
        return sum*sumof;
    }
}