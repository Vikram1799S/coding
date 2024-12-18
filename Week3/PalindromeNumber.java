package Week3;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.print("Enetr value :");
        Scanner sc = new Scanner(System.in);
        int inputInt = sc.nextInt();
        int checkInt = inputInt;
        int reversedInt = 0;
        while(checkInt > 0){
            reversedInt = (reversedInt*10) + (checkInt % 10);
            checkInt /= 10;
        }
        System.out.println(inputInt == reversedInt ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}