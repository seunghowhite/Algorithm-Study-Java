import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> resultList = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            if (check05(i)) {
                resultList.add(i);
            }
        }
        
        int[] answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        return answer.length > 0 ? answer : new int[]{-1};
    }
    
    public static boolean check05(int number) {
        String numberStr = String.valueOf(number);
        
        for (char c : numberStr.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        
        return true;
    }
}
