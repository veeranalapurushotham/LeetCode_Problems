class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> res=new ArrayList<>();
       for(int i=1;i<=numRows;i++)
       {
            ArrayList<Integer> curr=new ArrayList<>();
            curr.add(1);
            if(i==1)
            {
                res.add(curr);
                continue;
            }            
            List<Integer> befo=res.get(res.size()-1);
            for(int j=2;j<i;j++)
            {
                curr.add(befo.get(j-2)+befo.get(j-1));
            }
            curr.add(1);
            res.add(curr);

       }
       return res;
    }
}