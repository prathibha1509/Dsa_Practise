class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer>arr=new ArrayList<>();
        while(n>0){
            int dig=n%10;
            arr.add(dig);
            n=n/10;
        }
        int[] an=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            an[i]=arr.get(i);
        }
        Arrays.sort(an);
        int prod=an[an.length-1]*an[an.length-2];
        return prod;

        
    }
}