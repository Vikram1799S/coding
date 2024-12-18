package Week4;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        System.out.print("Enter the array size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("Smallest element of the array is : " + small);
        sc.close();
    }
}
