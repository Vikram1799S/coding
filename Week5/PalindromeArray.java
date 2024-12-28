package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {
        System.out.print("Enter the array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int revArr[] = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            revArr[(n-1)-i] = arr[i];
        }
        System.out.println(Arrays.equals(arr, revArr));
        sc.close();
    }
}

// 5
// 1 2 3 2 1
// true