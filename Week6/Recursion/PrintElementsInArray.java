package Week6.Recursion;

import java.util.Scanner;

public class PrintElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArr(arr, n, 0);
        sc.close();
    }

    static void PrintArr(int arr[], int n, int i) {
        if (i >= n)
            return;
        else {
            System.out.println(arr[i]);
            PrintArr(arr, n, i + 1);
        }
    }
}

/*
 * 5 1 2 3 4 5
 * OP :
 * 1
 * 2
 * 3
 * 4
 * 5
 */