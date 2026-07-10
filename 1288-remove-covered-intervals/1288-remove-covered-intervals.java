class Solution {
    public boolean cover(int [] first,int[] second ){
        if(second[0]<=first[0] && first[1]<=second[1]){
            return true;
        }
        return false;
    }
    public int removeCoveredIntervals(int[][] intervals) {
        int count=intervals.length;
        for (int i = 0; i < intervals.length; i++) {
            for (int j = 0; j < intervals.length; j++) {
                if (i == j) continue;  
                if (cover(intervals[i], intervals[j])) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}