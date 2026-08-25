class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> con=new HashSet<>();
        for(int i:nums)
        {
            con.add(i);
        }
        int i=2;
        int curr=k;
        while(con.contains(curr))
        {
            curr=k*i;
            i++;
        }
        return curr;
    }
}