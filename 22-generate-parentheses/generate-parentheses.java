class Solution {
    void back(List<String> res, int n, String cur,int open,int close)
    {
        if(cur.length()==2*n)
        {
            res.add(cur);
            return;
        }
        if(open<n)
        {
            
            back(res,n,cur+'(',open+1,close);

        }
        if(close<open)
        {
            
            back(res,n,cur+')',open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<String>();
        back(res,n,"",0,0);
        return res;
            }
}