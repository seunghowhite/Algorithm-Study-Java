class Solution {
    public int[] solution(int[] arr, int[][] queries) {
         int Sub;
        for(int i = 0; i < queries.length; i++) {
            Sub = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = Sub;
        }
        return arr;
    }
}