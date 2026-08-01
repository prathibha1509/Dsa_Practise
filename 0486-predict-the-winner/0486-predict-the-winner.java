class Solution {
    public int solve(int left, int right,int[] nums,int[][]dp){
        if(dp[left][right]!=-1) return dp[left][right];
        if(left==right){
            return dp[left][right]=nums[left];
        }
        return dp[left][right]=Math.max((nums[left]-solve(left+1,right,nums,dp)),(nums[right]-solve(left,right-1,nums,dp)));
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int[][]dp=new int[n][n];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,n-1,nums,dp)>=0;
    }
}