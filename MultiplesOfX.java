import java.util.Scanner;

public class MultiplesOfX {
    public static void main(String[] args) {
        System.out.print("Enter the value : ");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int i=1;
        while(value*i <1001){
            System.out.println(value*i);
            i++;
        }
        sc.close();
    }
}
