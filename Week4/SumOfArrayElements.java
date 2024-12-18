package Week4;

import java.util.Scanner;

public class SumOfArrayElements {

    public static void main(String[] args) {
        System.out.print("Enter the array size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int value : arr) {
            sum += value;
        }
        System.out.print("Sum of the array is : " + sum);
        sc.close();
    }
}