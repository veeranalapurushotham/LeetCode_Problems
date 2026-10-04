class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> fre= new HashMap<>();
        for(int i: nums)
        {
            fre.put(i,fre.getOrDefault(i,0)+1);
        }
        int res=0;
        int value=0;
        for(Map.Entry<Integer,Integer> ent: fre.entrySet())
        {
            if(ent.getValue()>value)
            {
                res=ent.getKey();
                value=ent.getValue();
            }
        }
        return res;
    }
}