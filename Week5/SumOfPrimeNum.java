package Week5;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfPrimeNum {
    public static void main(String arg[]) {
        System.out.print("Enter the left side number : ");
        Scanner sc = new Scanner(System.in);
        int leftNum = sc.nextInt();
        System.out.print("Enter the left side number : ");
        int rightNum = sc.nextInt();
        int arr[] = new int[rightNum];
        Arrays.fill(arr, 1);
        for (int i = 2; i < Math.sqrt(rightNum); i++) {
            if (arr[i] == 1) {
                for (int j = i * 2; j < rightNum; j = j + i) {
                    arr[j] = 0;
                }
            }
        }
        int sum = 0;
        for (int k = leftNum; k < rightNum; k++)
            if (arr[k] == 1)
                sum += k;
        System.out.println(sum);
        sc.close();
    }
}

/*
10
20
O/P : 60
 */