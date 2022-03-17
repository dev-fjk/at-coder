package ABC086A;

import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc086_a
 */
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final String RESULT_ODD = "Odd";
    private static final String RESULT_EVEN = "Even";

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(((a * b) % 2 == 0) ? RESULT_EVEN : RESULT_ODD);
    }
}
