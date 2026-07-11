class Solution {
    public void rotate(int[] nums, int k) {
        int[] res=new int[nums.length];
        int n=nums.length;
        int j=0;
        k=k%n;
        for(int i=n-k;i<n;i++){
            res[j]=nums[i];
            j++;
        }
        
        for(int i=0;i<n-k;i++){
            res[j]=nums[i];
            j++;
        }
        for(int i=0;i<n;i++){
            nums[i]=res[i];
        }
    }
}