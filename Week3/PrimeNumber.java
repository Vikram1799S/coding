package Week3;

import java.util.Scanner;
class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n>1){
            for(int i = 2; i<=n ; i++){
                boolean flag = true;
                for(int j=2; j<i;j++){
                    if(i%j == 0)
                        flag = false; 
                }
                if(flag) System.out.print(i+" ");
            }
        }else if(n==1)
            System.out.println(n);
        else System.out.print("Enter the valid number!");
        sc.close();
    }
}
