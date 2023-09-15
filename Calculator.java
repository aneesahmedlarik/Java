package Pack1;
import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
          int n;
            System.out.println("calculator in Java");
            System.out.println("Enter the choice");
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            n = input.nextInt();
            switch (n) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mult();
                    break;
                case 4:
                    div();
                    break;
                default:
                    System.out.println("choice was incorrect");
            }
        }

        public static void add() {
            Scanner input = new Scanner(System.in);

            System.out.print("enter first value = ");
            float x = input.nextFloat();
            System.out.print("enter second value = ");
           float y = input.nextFloat();
            System.out.println("the addition of " + x + " and " + y + " is " + (x + y));
        }

        public static void sub() {
            Scanner input = new Scanner(System.in);
            System.out.print("enter first value = ");
            float x = input.nextFloat();
            System.out.print("enter second value = ");
            float y = input.nextFloat();
            System.out.println("the subtraction of " + x + " and " + y + " is " + (x - y));
        }

        public static void mult() {
            Scanner input = new Scanner(System.in);
            System.out.print("enter first value = ");
           float x = input.nextFloat();
            System.out.print("enter second value = ");
            float y = input.nextFloat();
            System.out.println("the multiplication of " + x + " and " + y + " is " + (x * y));
        }

        public static void div() {
            Scanner input = new Scanner(System.in);
            System.out.print("enter first value = ");
         float x = input.nextFloat();
            print:
            System.out.print("enter second value (non zero) = ");
            float y = input.nextFloat();
            System.out.println("the division of " + x + " and " + y + " is " + (x / y));
        }
    }


