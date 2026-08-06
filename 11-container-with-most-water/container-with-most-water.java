class Solution {
    public int maxArea(int[] height) {
        int f=0;
        int l=height.length-1;
        int ma=0;
        while(f<l)
        {
            ma=Math.max(ma,Math.min(height[f],height[l])*(l-f));
            if(height[f]<height[l])
            {
                f++;
            }
            else
            {
                l--;
            }
        }
        return ma;
    }
}