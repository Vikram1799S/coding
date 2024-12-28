package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxArrProduct {
    public static void main(String[] args) {
        System.out.print("Enter the first array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = getSortedArray(n, sc);
        System.out.print("Enter the second array length : ");
        int sal = sc.nextInt();
        int arr2[] = getSortedArray(sal, sc);
        System.out.println(arr[arr.length - 1] * arr2[0]);
        sc.close();
    }

    static int[] getSortedArray(int n, Scanner sc) {
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        return arr;
    }
}
