class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans=-1;
        int dis=Integer.MAX_VALUE;
        int i=0;
        for(int[] d:drones){
            int curr=Math.abs(d[0]-target[0])+Math.abs(d[1]-target[1]);
            if(curr<dis && curr<=d[2]){
                dis=curr;
                ans=i;
            }
            i++;
        }
        return ans;
    }
}