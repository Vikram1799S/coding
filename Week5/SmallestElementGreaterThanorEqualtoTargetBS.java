package Week5;

import java.util.Scanner;

public class SmallestElementGreaterThanorEqualtoTargetBS {
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
        int result = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == fi) {
                result = mid;
                break;
            } else if (arr[mid] > fi) {
                high = mid - 1;
            } else if (arr[mid] < fi) {
                low = mid + 1;
            }
        }
        for (int v = result + 1; v < n; v++) {
            if (arr[result] != arr[v]) {
                System.out.println(arr[v]);
                break;
            }
        }
        sc.close();
    }
}

/*
 4
 1 3 5 7
 O/P : 5
 */