package Week5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlternateElement {
    public static void main(String[] args) {
        System.out.print("Enter the array length : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        List<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                arrList.add(arr[i]);
        }
        System.out.println(arrList);
        sc.close();
    }
}
//5
//1 2 3 4 5
//[1, 3, 5]