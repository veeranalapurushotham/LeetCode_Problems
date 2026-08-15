class Solution {
    public int maxArea(int[] height) {
       int s=0;
        int l=height.length-1;
        int max=0;
        while(s<l)
        {
            max=Math.max(max,Math.min(height[s],height[l])*(l-s));
            if(height[s]<height[l])
            {
                s++;
            }
            else
            {
                l--;
            }
        }
        return max;
    }
}