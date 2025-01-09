package Week6.Recursion;

import java.util.Scanner;

public class RecursionSample2 {

    static void recSam(int n) {
        System.out.println("Count : " + n);
        n--;
        if (n == 0)
            return;
        recSam(n);
        n++;
        System.out.println("Count : " + n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();;
        recSam(n);
        sc.close();
    }
}

/*
Enter n : 10
Count : 10
Count : 9
Count : 8
Count : 7
Count : 6
Count : 5
Count : 4
Count : 3
Count : 2
Count : 1
Count : 2
Count : 3
Count : 4
Count : 5
Count : 6
Count : 7
Count : 8
Count : 9
Count : 10
 */