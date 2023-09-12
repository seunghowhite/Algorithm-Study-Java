class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int num : num_list) {
            int i = num; 
            while (i != 1) { 
                if (i % 2 == 0) {
                    i = i / 2;
                } else {
                    i = (i - 1) / 2;
                }
                answer++; 
            }
        }
        return answer;
    }
}
