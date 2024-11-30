import java.util.Scanner;

public class SplitALine{
    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = sc.next().replace(" ", "");
        char ch = sc.next().replace(" ", "").charAt(0);
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
        sc.close();;
    }
}