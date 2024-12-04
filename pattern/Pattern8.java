import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}

// 6

/*
 * 654321
 * 54321
 * 4321
 * 321
 * 21
 * 1
 */