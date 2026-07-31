class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int ans=0;
        int ind=0;
        for(int i=25;i>=0;i--){
            if(freq[i]==0) continue;
            int push=(ind/8)+1;
            ans+=push*freq[i];
            ind++;
        }
        return ans;
    }
}