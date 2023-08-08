class Solution {
    public int solution(int a, int b) {
        int answer =0;
        int AB =Integer.parseInt(Integer.toString(a)+Integer.toString(b));
        int doubleAB =2*a*b;
        
        if(AB<doubleAB){
            answer=doubleAB;
        }else if(AB>=doubleAB){
            answer=AB;
        }
        return answer ;
    }
}