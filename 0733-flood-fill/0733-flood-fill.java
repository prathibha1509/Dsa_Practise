class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        Queue<int[]>q=new LinkedList<>();
        int[][]dir={{1,0},{0,1},{-1,0},{0,-1}};
        q.offer(new int[]{sr,sc});
        int num=image[sr][sc];
        image[sr][sc]=color;
        boolean[][]visited=new boolean[image.length][image[0].length];
        visited[sr][sc]=true;
        while(!q.isEmpty()){
            int[]curr=q.poll();
            int r=curr[0];
            int c=curr[1];
            for(int[]d:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr>=0 && nr<image.length && nc>=0 && nc<image[0].length && visited[nr][nc]==false){
                    visited[nr][nc]=true;
                    if(image[nr][nc]==num){
                        q.add(new int[]{nr,nc});
                        image[nr][nc]=color;
                    }
                }
            }
        }
        return image;
    }
}