import java.util.Scanner;

public class TriangleCheck {
    public static void main(String[] args) {
        System.out.print("Enter the values : ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        if(num1 + num2 + num3 == 180)
            System.out.println("Triangle can be formed");
        else
            System.out.println("Triangle cannot be formed");
        sc.close();
    }
}
