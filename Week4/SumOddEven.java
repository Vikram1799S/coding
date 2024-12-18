package Week4;

import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        System.out.print("Enter the array size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int val : arr){
            if(val % 2 ==0) sumEven += val; else sumOdd += val;
        }
        System.out.println("Sum of odd numbers : "+sumOdd);
        System.out.println("Sum of even numbers : "+sumEven);
        sc.close();
    }
}
