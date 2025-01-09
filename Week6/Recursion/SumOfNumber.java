package Week6.Recursion;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Output : " + sum(sc.nextInt()));
        sc.close();
    }

    private static int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }
}

/*
 * 5
 * OP : 15
 */