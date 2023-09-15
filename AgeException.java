package Exception;

import java.util.Scanner;

public class AgeException {
    public static void agechecker(int age) throws ArithmeticException{

try{
     if(age<18){
            throw new ArithmeticException("under age exception");
        }
        else{
            System.out.println("you can apply for driving license.");
        }
}catch(ArithmeticException a){
    System.out.println(" caught ");
    System.out.println(a);
}


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

       try{
           agechecker(x);
       }catch(ArithmeticException e){
           System.out.println(" aha caught ");
           System.out.println(e.getMessage());
       }

    }


}
