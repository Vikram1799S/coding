import java.util.ArrayList;
import java.util.Scanner;

public class Patter5 {
    public static void main(String[] args) {
        System.out.print("Enter N : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> listInt = new ArrayList<>();
        for(int i=n ; i>=1 ; i--){
            for(int j=n ; j>=1 ; j--){
                for(int k =1 ; k <= i ; k++){
                    listInt.add(j);
                }
            }
            listInt.add(-1);
        }
        System.out.println(listInt);
        sc.close();
    }
}
