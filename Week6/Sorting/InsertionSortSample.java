package Week6.Sorting;

import java.util.Scanner;

public class InsertionSortSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int v = 0; v < n; v++) {
            arr[v] = sc.nextInt();
        }
        sortArr(arr);
        sc.close();
    }

    static void sortArr(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}

/*
 * 5
 * 2 5 3 4 1
 * 1 2 3 4 5
 */
