class Solution {
    public void dfs(int[][] grid,int i,int j,boolean[][]visited){
        int m=grid.length;
        int n=grid[0].length;
        if(i<0||j<0||i>=m||j>=n||grid[i][j]!=1||visited[i][j]){
            return;
        }
        visited[i][j]=true;
        dfs(grid,i+1,j,visited);
        dfs(grid,i-1,j,visited);
        dfs(grid,i,j+1,visited);
        dfs(grid,i,j-1,visited);

    }
    public int numEnclaves(int[][] grid) {
        int count=0;
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] visited=new boolean[m][n];
        for(int i=0;i<m;i++){
            dfs(grid,i,0,visited);
            dfs(grid,i,n-1,visited);
        }
        for(int j=0;j<n;j++){
            dfs(grid,0,j,visited);
            dfs(grid,m-1,j,visited);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
    }
}