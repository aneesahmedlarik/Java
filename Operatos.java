
import java.util.*;
public class Operatos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int k=10;
        int l=3;
        System.out.println("from the numbers =" +k+" "+l);
        System.out.print("addition= ");
        System.out.println(k+l);
        System.out.print("subtraction= ");

        System.out.println(k-l);
        System.out.print("Multiplication= ");
        System.out.println(k*l);
        System.out.print("division= ");
        System.out.println(k/l);
        System.out.print("module = ");
        System.out.println(k%l);

        System.out.println("\nenter to numbers for Additon= ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.print("the additon is = ");
        System.out.println(a+b);
        System.out.println("enter to numbers for subtraction= ");
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.print("the subtraction is ");
        System.out.println(c-d);
        System.out.println("enter to numbers for multiplication= ");
        int e=sc.nextInt();
        int f=sc.nextInt();
        System.out.print("the multiplication is ");
        System.out.println(e*f);
        System.out.println("enter to numbers for divion= ");
        int g=sc.nextInt();
        int h=sc.nextInt();
        System.out.print("the division is ");
        System.out.println(g/h);
        System.out.println("enter to numbers for module= ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        System.out.print("the module is ");
        System.out.println(i%j);
    }
}
