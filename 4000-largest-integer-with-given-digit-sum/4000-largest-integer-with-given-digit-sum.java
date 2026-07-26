class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        if(s>9*n) return -1;
        int num=0;
        int rem=s;
        while(n>0){
            int dig=Math.min(9,rem);
            num=num*10+dig;
            rem-=dig;
            n--;
        }
        return num;
        
    }
}