class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int prod=1;
        int org=n;
        while(org>0)
        {
            sum+=org%10;
            prod=prod*(org%10);
            org=org/10;
        }
        int ress=sum+prod;
        
        return n%ress==0;
    }
}