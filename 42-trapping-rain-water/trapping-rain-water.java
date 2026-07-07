class Solution {
    public int trap(int[] height) {
        
        int l = 0;
        int r = height.length-1;
        int sum = 0;
        int left_max=0;
        int right_max=0;
        while(l<r) {
            left_max=Math.max(left_max,height[l]);
            right_max=Math.max(right_max,height[r]);
            if(left_max<right_max) {
                sum+=left_max-height[l];
                l++;
            }else{
                sum+=right_max-height[r];
                r--;
            }
        }
        return sum;
    

    }
}