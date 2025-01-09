package Week6.Recursion;

import java.util.Scanner;

public class FactOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Output : " + fact(sc.nextInt()));
        sc.close();
    }

    private static int fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }
}

/*
 * 10
 * OP : 3628800
 */
