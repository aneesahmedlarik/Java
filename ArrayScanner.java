package Exception;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     int []array= {23,25,27,30};
        System.out.println("from array...! ");
        for(int i=0;i<array.length;i++){
            System.out.println("array["+i+"] = "+array[i]);
        }

        System.out.println("enter index...!");
     int index= sc.nextInt();
        System.out.println("enter a number that you want to divide with..!");
        int n= sc.nextInt();
        try{
            System.out.println("the number "+array[index]+"   and  "+n);
            System.out.println(array[index]/n);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("array out of bound..!");
            System.out.println(e1.getMessage());
        }
        catch(ArithmeticException e2){
            System.out.println("Arithmetic exception");
            System.out.println(e2);

        }  }}
