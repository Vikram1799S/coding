package Week6.Recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Output : " + fib(sc.nextInt()));
        sc.close();
    }

    private static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}

/*
 * 10
 * OP : 55
 */