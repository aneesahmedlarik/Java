import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any two numbers= ");
        float a= sc.nextInt();
        float b= sc.nextInt();

      System.out.println("enter 1 for Addition ");
      System.out.println("enter 2 for Subtraction ");
      System.out.println("enter 3 for multiplication ");
      System.out.println("enter 4 for Division ");
      byte ch=sc.nextByte();

      if(ch==1){

          System.out.println("there addition is "+(a+b));
      }


       else if(ch==2){

            System.out.println("there Subtraction  is "+(a-b));
        }
        else if(ch==3) {

          System.out.println("there Multiplication is " + (a * b));
      }       else if(ch==4){
           System.out.println("there division is "+(a/b));
        }
        else {
          System.out.println("invalid input");
        }}}
