import java.util.Scanner;

public class SizeCheck {
    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        byte value = sc.nextByte();
        switch (value) {
            case 29:
                System.out.println("Small");
                break;
            case 30:
                System.out.println("Medium");
                break;
            case 38:
                System.out.println("Large");
                break;
            case 42:
                System.out.println("XLarge");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();
    }
}
