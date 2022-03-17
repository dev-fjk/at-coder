package ABC081A;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://atcoder.jp/contests/abs/tasks/abc081_a
 */
public class Main {

    private static final Scanner sc = new Scanner(System.in);
    private static final String COLLECT = "1";

    public static void main(String[] args) {
        String s = sc.next();
        var arrayString = s.split("");
        System.out.println(Arrays.stream(arrayString).filter(c -> c.equals(COLLECT)).count());
    }
}
