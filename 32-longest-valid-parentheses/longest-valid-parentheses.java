class Solution {
    public int longestValidParentheses(String s) {
        if(s.length()==0)
        {
            return s.length();
        }
        int open=0,close=0;
        int max=0;
        for(char i: s.toCharArray())
        {
            if(i=='(')
                open++;
            else
                close++;
            if(open==close)
            {
                max=Math.max(max,open+close);
            }
            if(close>open)
            {
                close=0;
                open=0;
            }
        }
        open=0;
        close=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char curr=s.charAt(i);
            if(curr==')')            
                close++;
            else
                open++;
            if(open==close)
            {
                max=Math.max(max,open+close);
            }
            if(open>close)
            {
                close=0;
                open=0;
            }
            
        }
        
        return max;

    }
}