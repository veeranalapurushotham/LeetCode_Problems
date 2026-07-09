class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            ArrayList<Integer> cur=new ArrayList<>();

            cur.add(1);
            for(int j=1;j<i-1;j++)
            {
                cur.add(res.get(i-2).get(j-1)+res.get(i-2).get(j));
            }
            if(i>1)
                cur.add(1);
            res.add(cur);
        }
        return res;
    }
}