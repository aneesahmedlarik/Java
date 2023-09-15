import java.util.*;
public class EvenNumberMethod {
    public static void  checkDriving(int x){
    if(x>=18){
        System.out.println("You are eligible for driving licence. ");
    }
        else{
            System.out.println("come back when you are 18 or above.");
}}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age= ");
    int x=sc.nextInt();
    checkDriving(x);
    }}