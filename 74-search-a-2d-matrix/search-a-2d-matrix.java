class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int column=matrix[0].length;
        int i=0;
        int j=row*column-1;
        while(i<=j)
        {
            int mid=i+(j-i)/2;
            int ri=mid/column;
            int ci=mid%column;
            int value=matrix[ri][ci];
            if(value==target)
            {
                return true;
            }
            else if(value<target)
            {
                i=mid+1;
            }
            else
            {
                j=mid-1;
            }
        }
        return false;
    }
}