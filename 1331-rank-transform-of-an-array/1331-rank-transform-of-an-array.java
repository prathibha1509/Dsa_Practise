class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]copy=arr.clone();
        Arrays.sort(copy);
        int j=1;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(copy[i])){
                map.put(copy[i],map.get(copy[i]));
            }
            else{
                map.put(copy[i],j++);
            }
        }
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}