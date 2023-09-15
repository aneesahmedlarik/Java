import java.time.LocalDate;
import java.util.Scanner;


public class Age {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
             System.out.print("enter your date of birth  please. ");
            int b_year= sc.nextInt();
            int currentYear = LocalDate.now().getYear();
            int age  = currentYear - b_year;



        System.out.println("Age is= "  +age);

        }
    }

