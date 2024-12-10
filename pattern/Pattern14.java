import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(S);
        for(int i=1; i<=S.length()-1;i++){
            sb.append(".".repeat(i));
            sb.append(S.substring(1,S.length()));
            System.out.println(".".repeat(i)+S.substring(i,S.length()));
        }
        sc.close();
    }
}
