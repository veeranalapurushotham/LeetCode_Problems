class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashSet<Integer> res=new HashSet<>();
        HashMap<Integer,Integer> fre=new HashMap<>();
        for(int i:nums)
        {
            int curr=fre.getOrDefault(i,0)+1;
            fre.put(i,curr);
            if(curr>(nums.length/3))
            {
                res.add(i);
            }
        }
        return new ArrayList<>(res);
    }
}