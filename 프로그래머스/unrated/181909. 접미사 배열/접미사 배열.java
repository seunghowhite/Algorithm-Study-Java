import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int myStrLength =my_string.length();
        String [] ansTemp = new String[myStrLength];
         for (int i = 0; i < myStrLength; i++) {
            ansTemp[i] = my_string.substring(i);
        }
        
        Arrays.sort(ansTemp);
        return ansTemp;
    }
}