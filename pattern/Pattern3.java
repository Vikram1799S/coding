import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}

// 4

/*
 * 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1
 * 4 3 2 1
 */