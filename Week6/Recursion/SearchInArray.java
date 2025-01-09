package Week6.Recursion;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        System.out.print("Enter the target : ");
        int t = sc.nextInt();
        System.out.println(searchArr(arr, n, 0, t));
        sc.close();
    }

    static boolean searchArr(int arr[], int n, int i, int t) {
        if (i >= n) {
            return false;
        } else if (t == arr[i]) {
            return true;
        } else
            return searchArr(arr, n, i + 1, t);
    }
}
