class Solution {
    public int solve(int[][]grid,int[][]dp,int m,int n){
        if(m==0 && n==0) return grid[m][n];
        if(dp[m][n]!=-1) return dp[m][n];
        if(m==0) return solve(grid,dp,m,n-1)+grid[m][n];
        if(n==0) return solve(grid,dp,m-1,n)+grid[m][n];
        int up=solve(grid,dp,m-1,n);
        int left=solve(grid,dp,m,n-1);
        return dp[m][n]=grid[m][n]+Math.min(up,left);


    }
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
       int[][]dp=new int[m][n];
       for(int[] row:dp){
        Arrays.fill(row,-1);
       }
       return solve(grid,dp,m-1,n-1);
    }
}