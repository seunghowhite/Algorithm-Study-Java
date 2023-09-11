class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i += m) {
            int endIndex = Math.min(i + m, my_string.length());
            String slice = my_string.substring(i, endIndex);
            char pick = slice.charAt(c-1);
            answer.append(pick);       
        }
        return answer.toString();
    }
}
