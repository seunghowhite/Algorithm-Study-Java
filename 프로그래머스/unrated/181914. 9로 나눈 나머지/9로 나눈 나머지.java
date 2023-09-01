class Solution {
    public int solution(String number) {
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            int digit = Character.getNumericValue(c);
            temp += digit;
        }
        return answer=temp%9;
    }
}
