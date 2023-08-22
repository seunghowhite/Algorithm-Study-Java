class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();

        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (  i%query[2] == 0) { 
                    System.out.println("과연 " + i);
                    answer[i ] = answer[i ] + 1; 
                }
            }
        }

        return answer;
    }
}
// class Solution {
//     public int[] solution(int[] arr, int[][] queries) {
//         for(int i = 0; i < queries.length; i++)
//             for(int j = queries[i][0]; j <= queries[i][1]; j++) {
//                 if(j % queries[i][2] == 0)
//                     arr[j]++;
//         }
//         return arr;
//     }
// }