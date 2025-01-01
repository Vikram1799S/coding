package Week5;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.print("Enter the array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.print("In the array which number you to find : ");
        int fi = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int mid = (low + high) / 2;
        boolean isAvailable = false;
        while (low <= high) {
            mid = (low + high) / 2;
            System.out.println("---" + low + "---" + mid + "---" + high + "---");
            if (arr[mid] == fi) {
                System.out.println(arr[mid]);
                break;
            } else if (arr[mid] > fi) {
                high = mid - 1;
            } else if (arr[mid] < fi) {
                low = mid + 1;
            }
        }
        if(!isAvailable) System.out.println("The number you entered not in the array...");
        sc.close();
    }
}

/*

1 2 3 4 5 6
In the array which number you to find : 2
---0---2---5---
---0---0---1---
---1---1---1---
2

*/