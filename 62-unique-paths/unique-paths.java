class Solution {
    int back(int n,int m,int[][] visited,int i,int j)
    {
        if(i==m-1 && j==n-1)
        {
            
            return 1;
        }
        if(visited[i][j]!=0)
        {
            return visited[i][j];
        }
        int left=0;
        if(j+1<n )
        {
            left=back(n,m,visited,i,j+1);
        }
        int right=0;
        if(i+1<m )
        {
         right=back(n,m,visited,i+1,j);
        }
        visited[i][j]=left+right;
        return visited[i][j];
    }
    public int uniquePaths(int m, int n) {
      int [][] visited=new int[m][n];
     
      
      int res=back(n,m,visited,0,0);
      return res;
      
    }
}