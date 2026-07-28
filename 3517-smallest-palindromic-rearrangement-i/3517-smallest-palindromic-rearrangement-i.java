class Solution {
    public String smallestPalindrome(String s) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        StringBuilder left=new StringBuilder();
        String cen="";
        for(int i=0;i<26;i++){
            if(arr[i]%2==1){
                cen=String.valueOf((char)(i+'a'));
            }
            for(int j=0;j<arr[i]/2;j++){
                left.append((char)(i+'a'));
            }
        }
        String right=new StringBuilder(left).reverse().toString();
        return left.toString()+cen+right;

        
    }
}