class Solution {
    public int countDigits(int num) {
        int cnt=0;
        int or=num;
        while(or>0)
        {
            if(num%(or%10)==0)
            {
                cnt++;
            }
            or=or/10;
        }
        return cnt;
    }
}