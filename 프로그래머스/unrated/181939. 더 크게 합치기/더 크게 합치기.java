class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String AB =Integer.toString(a)+Integer.toString(b);
        String BA =Integer.toString(b)+Integer.toString(a);
        int NumberAB = Integer.parseInt(AB);
        int NumberBA = Integer.parseInt(BA);
        
        return NumberAB>NumberBA?NumberAB:NumberBA;
    }
}