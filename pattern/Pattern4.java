import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println("");
        }
        sc.close();
    }
}

// 4

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 */