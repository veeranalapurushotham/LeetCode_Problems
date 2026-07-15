class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumod=0;
        int sumev=0;
        for(int i=1;i<=2*n;i++)
        {
            if(i%2==0)
            {
                sumev+=i;
            }
            else
            {
                sumod+=i;
            }
        }
        while(sumod!=0)
        {
            int temp=sumod;
            sumod=sumev%sumod;
            sumev=temp;
            
        }
        return  sumev;
    }
}