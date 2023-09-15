import java.util.*;
public class Mcqs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("what is the correct way to declare a variable to store an integer value in Java? ");

         System.out.println("a. int 1x= 10; ");
         System.out.println("b. int x=10;  ");
         System.out.println("c. float x=10.0f ");
         System.out.println("d. String x= "+"10"+";  ");
        System.out.print("Enter your option please. ");
    char ch= sc.next().charAt(0);

    switch(ch){
        case 'a':
            System.out.println(" A is int 1x= 10; ");
        break;
        case 'b':
            System.out.println(" B is int x=10; ");
            break;case 'c':
            System.out.println(" C is float x=10.0f ");
            break;case 'd':
            System.out.println(" D is String x= "+"10"+"; ");
            break;




    }


    }
}
