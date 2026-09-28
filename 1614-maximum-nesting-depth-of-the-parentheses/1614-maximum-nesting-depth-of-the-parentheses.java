class Solution {
    public int maxDepth(String s) {
     Stack<Character>st=new Stack<>();
     int count=0;
     int depth=0;
     for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if (c=='('){
            count++;
            depth=Math.max(count,depth);
        }
        else if (c==')'){
            count--;
        }
     }
     return depth;
    }
}