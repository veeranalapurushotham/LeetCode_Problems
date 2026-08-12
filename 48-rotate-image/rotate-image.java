class Solution {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
            
                if(i<j)
                {
                    int temp=matrix[j][i];
                    matrix[j][i]=matrix[i][j];
                    matrix[i][j]=temp;
                }
            }
        }
        for(int i=0;i<row;i++)
        {
            int k=0;
            int c=col-1;
            while(k<c)
            {
                int temp=matrix[i][c];
                matrix[i][c]=matrix[i][k];
                matrix[i][k]=temp;
                k++;
                c--;
            }

        }

    }
}