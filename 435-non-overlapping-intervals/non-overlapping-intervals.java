class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int cnt=0;
        int sec=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            int[] cur=intervals[i];
            if(intervals[i][0]<sec )
            {
                cnt++;
            }
            else
            {

                sec=intervals[i][1];
            }
        }
        return cnt;
    }
}