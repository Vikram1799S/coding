package Week6.Recursion;

import java.util.Scanner;

public class CountZerosInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(count(sc.nextInt()));
        sc.close();
    }

    private static int count(int n) {
        if (n % 10 == n) {
            if (n == 0)
                return 1;
            else
                return 0;
        }
        if (n % 10 == 0) {
            return 1 + count(n / 10);
        } else {
            return count(n / 10);
        }
    }
}

/*
 * 10023010
 * OP : 4
 */