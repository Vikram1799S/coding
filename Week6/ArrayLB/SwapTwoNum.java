import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enetr the value of b : ");
        int b = sc.nextInt();
        System.out.println("Before : "+ a + " - " + b);
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("After : "+ a + " - " + b);
        sc.close();
    }
}
