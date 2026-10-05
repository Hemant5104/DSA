class Solution {
    public int scoreOfParentheses(String s) {
        int score=0;
        int d=0;
        for( int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                d++;
            }
            else{
                d--;
                if(s.charAt(i-1)=='('){
                    score+=1<<d;
                }
            }
        }
        return score;
    }
}