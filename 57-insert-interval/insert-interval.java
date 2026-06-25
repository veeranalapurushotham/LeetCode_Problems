class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> res=new ArrayList<>();
        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][1]<newInterval[0])
            {
                res.add(intervals[i]);
            }
            else if(intervals[i][0]<=newInterval[1])
            {
                newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
                newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            }
            else
            {
                res.add(intervals[i]);
            }
            
            
        }
        res.add(newInterval);
        res.sort((arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        return res.toArray(new int[res.size()][]);
    }
}