package Week6.Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sumOfDigits(sc.nextInt()));
        sc.close();
    }

    private static int sumOfDigits(int n) {
        if (n % 10 == n)
            return n;
        else
            return (n % 10) + sumOfDigits(n / 10);
    }
}

/*
 * 342
 * OP : 9
 */