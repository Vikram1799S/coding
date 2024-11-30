import java.util.Scanner;

public class SplitALine{
    public static void main(String[] args) {
        System.out.print("Enter the values : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next();
        char ch = sc.next().charAt(0);
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
        sc.close();
    }
}