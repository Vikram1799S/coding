package Week6.Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(findPow(sc.nextInt(), sc.nextInt()));
        sc.close();
    }

    static int findPow(int a, int n) {
        if (n == 1)
            return a;
        return a * findPow(a, n - 1);
    }
}

/*
 * 2 3
 * 8
 * ------
 * 2 1
 * 2
 */
