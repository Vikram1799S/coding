import java.util.Scanner;

public class PrintNumNTime {
    public static void main(String[] args) {
        System.out.print("Enter the values : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int size = sc.nextInt();
        for(int i=0; i<size; i++){
            System.out.println(value);
        }
        sc.close();
    }
}
