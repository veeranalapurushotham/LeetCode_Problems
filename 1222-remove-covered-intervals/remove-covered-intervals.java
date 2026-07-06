class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
         int count=0;
         for(int i=0;i<intervals.length;i++)
         {
            int[] cur=intervals[i];
            for(int j=0;j<intervals.length;j++)
            {
                if(j!=i)
                {
                    int[] sec=intervals[j];
                    if(cur[0]>=sec[0] && cur[1]<=sec[1])
                    {
                        count=count+1;
                        break;
                    }
                }
            }
         }
         return intervals.length-count;
    }
}