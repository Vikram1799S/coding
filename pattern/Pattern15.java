import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N * 2 - 1];
        int count = 0;
        for (int i = N; i >= 1; i--) {
            StringBuilder sb = new StringBuilder();
            for (int j = N; j >= 1; j--) {
                if (i <= j) {
                    sb.append(j);
                } else {
                    sb.append(i);
                }
            }
            for (int k = 2; k <= N; k++) {
                if (i <= k) {
                    sb.append(i);
                } else {
                    sb.append(i);
                }
            }
            str[count] = sb.toString();
            count += 1;
        }
        for (int i = 2; i <= N; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = N; j >= 1; j--) {
                if (i <= j) {
                    sb.append(j);
                } else {
                    sb.append(i);
                }
            }
            for (int k = N - 1; k >= 1; k--) {
                if (i <= k) {
                    sb.append(k);
                } else {
                    sb.append(N);
                }
            }
            str[count] = sb.toString();
            count += 1;
        }
        // System.out.println(str);
        for (String st : str) {
            System.out.println(st);
        }
        sc.close();
    }
}
