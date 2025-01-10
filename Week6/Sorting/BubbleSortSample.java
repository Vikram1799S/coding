package Week6.Sorting;

import java.util.Scanner;

public class BubbleSortSample {
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
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}

/*
 * 6
 * 5 6 2 1 3 4
 * 1 2 3 4 5 6
 */
