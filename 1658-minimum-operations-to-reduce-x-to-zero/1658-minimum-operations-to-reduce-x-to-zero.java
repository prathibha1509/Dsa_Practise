class Solution {
    public int minOperations(int[] nums, int x) {
        int moves=0;
        int tot=0;
        for(int num:nums){
            tot+=num;
        }
        int rem=tot-x;
        if(rem==0){
            return nums.length;
        }
        if(rem<0){
            return -1;
        }
        int left=0;
        int sum=0;
        int maxlen=0;
        for(int right=0;right<nums.length;right++){
            sum+=nums[right];
            while(sum>rem){
                sum-=nums[left];
                left++;
            }
            if(sum==rem){
                maxlen=Math.max(maxlen,right-left+1);
            }
        }
        return maxlen>0? nums.length-maxlen: -1;
    }
}