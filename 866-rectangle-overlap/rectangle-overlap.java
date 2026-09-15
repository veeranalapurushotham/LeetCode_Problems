class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int left=Integer.max(rec1[0],rec2[0]);
        int right= Integer.min(rec1[2],rec2[2]);
        int top= Integer.max(rec1[1],rec2[1]);
        int bottom= Integer.min(rec1[3],rec2[3]);
        if(left<right && top<bottom)
            return true;
        else
            return false;
    }
}
