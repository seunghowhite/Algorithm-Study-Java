class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String first = my_string.substring(0, s);
        String slice = my_string.substring(s, e + 1);
        StringBuffer sb = new StringBuffer(slice);
        String reversedStr = sb.reverse().toString();
        String last = my_string.substring(e + 1, my_string.length());
        answer = first + reversedStr + last;
        return answer;
    }
}
