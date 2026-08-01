class Solution {
    public int solve(int left, int right,int[] nums){
        if(left==right){
            return nums[left];
        }
        return Math.max((nums[left]-solve(left+1,right,nums)),(nums[right]-solve(left,right-1,nums)));
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        return solve(0,n-1,nums)>=0;
    }
}