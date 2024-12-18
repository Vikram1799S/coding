package Week4;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        System.out.print("Enter the array size :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int lar = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for(int val : arr){
            if (val > lar) lar = val;
        }
        System.out.println("Largest element of the array is : "+ lar);
        sc.close();
    }
}
