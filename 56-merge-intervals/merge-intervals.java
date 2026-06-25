class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int []> result=new ArrayList<>();
        int [] pre=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[] cur=intervals[i];
            if(cur[0]<=pre[1])
            {
                pre[1]=Math.max(pre[1],cur[1]);
            }
            else{
                result.add(pre);
                pre=cur;
            }
        }
        result.add(pre);
        return result.toArray(new int[result.size()-1][]);
    }
}