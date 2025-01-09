package Week6.Recursion;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println(sumOfArr(arr, 0));
        sc.close();
    }

    static int sumOfArr(int arr[], int i) {
        if (i == arr.length - 1) {
            return arr[i];
        }
        return arr[i] + sumOfArr(arr, i + 1);
    }
}
