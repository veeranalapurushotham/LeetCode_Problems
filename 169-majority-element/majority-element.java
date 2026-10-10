class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> fre= new HashMap<>();
        for(int i: nums)
        {
            int curr=fre.getOrDefault(i,0)+1;
            fre.put(i,curr);
            if(curr>(nums.length)/2)
            {
                return i;
            }
        }
        return 0;
    }
}