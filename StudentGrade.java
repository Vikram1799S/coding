import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        System.out.print("Enter the mark : ");
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if(mark > 0 && mark < 101){
            if(mark < 35)
                System.out.println("Fail");
            else if(mark >= 35 && mark < 60)
                System.out.println("Grade D");
            else if(mark >= 60 && mark < 80)
                System.out.println("Grade C");
            else if(mark >= 80 && mark < 90)
                System.out.println("Grade B");
            else System.out.println("Grade A");
        }else
            System.out.println("Enter a valid mark to see a grade!");
        sc.close();
    }
}
