class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i<j)
                {
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                }
            }
        }
        for(int i=0;i<r;i++)
        {
            int k=c-1;
            int j=0;
            while(j<k)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
                j++;
                k--;
            }
        }
    }
}