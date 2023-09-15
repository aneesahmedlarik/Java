import java.util.*;

public class SwitchExample {

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("enter any two numbers= ");
     float a= sc.nextFloat();
            float b= sc.nextFloat();
            System.out.println("enter + for Addition ");
            System.out.println("enter - for Subtraction ");
            System.out.println("enter * for multiplication ");
            System.out.println("enter / for Division ");
           char ch=sc.next().charAt(0);
       switch(ch){
            case '+':
                System.out.println("there addition is "+(a+b));
                break;
            case '-':
                System.out.println("there Subtraction  is "+(a-b));
                break;

            case '*':

                System.out.println("there Multiplication is " + (a*b));
                break;
            case '/':
                System.out.println("there division is "+(a/b));
                break;
            default:
                System.out.println("invalid input");
                break;}
      }
}





