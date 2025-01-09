package Week6.Recursion;

import java.util.Scanner;

public class DivisorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        printDivisorsOfNumber(sc.nextInt(), 1);
        sc.close();
    }

    static void printDivisorsOfNumber(int n, int i) {
        if (i == n) {
            System.out.print(n);
            return;
        }
        if (n % i == 0)
            System.out.print(i + " ");
        printDivisorsOfNumber(n, i + 1);
    }
}

/*
 * Enter the n : 500
 * 1 2 4 5 10 20 25 50 100 125 250 500
 */
