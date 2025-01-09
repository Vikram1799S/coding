package Week6.Recursion;

import java.util.Scanner;

public class CheckIsSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(check(arr, 0));
        sc.close();
    }

    static boolean check(int arr[], int i) {
        if (i == arr.length - 2)
            return arr[i] < arr[i + 1] ? true : false;
        return arr[i] < arr[i + 1] ? check(arr, i + 1) : false;
    }
}

/*
 * Enter the n : 20
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
 * true
 * ---------------------------------------------------
 * Enter the n : 10
 * 1 2 66 4 5 6 7 8 9 10
 * false
 */
