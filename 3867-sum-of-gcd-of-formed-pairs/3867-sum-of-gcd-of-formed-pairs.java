class Solution {
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int[]mx=new int[nums.length];
        int[]prefix=new int[nums.length];
        mx[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>mx[i-1]){
                mx[i]=nums[i];
            }
            else{
                mx[i]=mx[i-1];
            }
        }
        for(int i=0;i<nums.length;i++){
            prefix[i]=gcd(mx[i],nums[i]);
        }
        Arrays.sort(prefix);
        long sum=0;
        int i=0;
        int j=nums.length-1;
        while(i<j && i!=j){
            sum+=gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;

        
    }
}