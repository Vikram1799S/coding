package Week5;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        System.out.print("Enter the array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the index to find the element : ");
        int nToFind = sc.nextInt();
        if(nToFind < arr.length)    
            System.out.println(arr[nToFind]);
        else System.out.println("Enter valid index...");
        sc.close();
    }
}

//5
//1 2 3 4 5
//index : 2
//o/p : 3
