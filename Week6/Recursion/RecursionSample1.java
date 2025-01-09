package Week6.Recursion;

import java.util.Scanner;
public class RecursionSample1 {

    static void recSam(int n) {
        System.out.println("Count : " + n);
        n--;
        if (n == 0)
            return;
        recSam(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        recSam(n);
        sc.close();
    }
}

/*
 * I/P : 5
 * Count : 5
 * Count : 4
 * Count : 3
 * Count : 2
 * Count : 1
 */