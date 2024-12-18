package Week4;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        System.out.print("Enter the array size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int val : arr){
            if(val % 2 ==0) countEven++; else countOdd++;
        }
        System.out.println("Count of odd numbers : "+countOdd);
        System.out.println("Count of even numbers : "+countEven);
        sc.close();
    }
}
