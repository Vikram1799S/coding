import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                val += 1;
                System.out.print(val+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

//5

/*
 
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */