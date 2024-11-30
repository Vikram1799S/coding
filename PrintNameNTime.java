import java.util.Scanner;

public class PrintNameNTime {
    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        String firatName = sc.nextLine();
        String lastName = sc.nextLine();
        int n = sc.nextInt();
        for(int i=0 ; i<n; i++){
            System.out.println(firatName+lastName);
        }
        sc.close();
    }
}
