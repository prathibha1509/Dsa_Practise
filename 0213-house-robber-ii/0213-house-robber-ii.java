class Solution {
    public int solve(int[] arr){
        int n=arr.length;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        int[] dp=new int[n];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            dp[i]=Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] first=new int[nums.length-1];
        int[] second=new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            first[i]=nums[i];
        }
        for(int i=1;i<nums.length;i++){
            second[i-1]=nums[i];
        }
        return Math.max(solve(first),solve(second));
        
    }
}