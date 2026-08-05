class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> obj=new HashMap<>();
        for(int i:nums)
        {
            if(obj.containsKey(i))
            {
                return true;
            }
            obj.put(i,0);
        }
        return false;
    }
}