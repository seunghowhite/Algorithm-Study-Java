import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            stringBuilder.append(str);
        }

        String strings = stringBuilder.toString();
        System.out.println(strings);
    }
}
