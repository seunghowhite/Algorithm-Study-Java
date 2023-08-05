class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String sliceString = my_string.substring(0, s);
        
        String overSlice = sliceString + overwrite_string;
        
        String remainingString = my_string.substring(overSlice.length());

        
        return overSlice+remainingString;
    }
}
