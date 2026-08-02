class Solution {
    public int solve(int start,int end,int[]arr,int[][] dp){
        if(dp[start][end]!=-1) return dp[start][end];
        if(start==end){
            return dp[start][end]=arr[start];
        }
        int right=solve(start,end-1,arr,dp);
        int left=solve(start+1,end,arr,dp);
        return dp[start][end]=Math.max(left,right);
    }
    public boolean stoneGame(int[] piles) {
        int n=piles.length;
        int[][]dp=new int[n][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,0,piles,dp)>0;
    }
}