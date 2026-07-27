class Solution {
    public int maxProduct(int[] nums) {
        int maxone=0;
        int maxtwo=0;
        for(int num:nums){
            if(num>maxone){
                maxtwo=maxone;
                maxone=num;
            }
            else if(num>maxtwo){
                maxtwo=num;
            }
        }
        return (maxtwo-1)*(maxone-1);
    }
}