import java.util.*;
public class UnaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number= ");
        int a=sc.nextInt();
       int b;
        b=a++;
      /*  System.out.println(b);
        System.out.println(a);*/

        System.out.println("\n");
        b=++a;
        System.out.println(b);
        System.out.println(a);
  }

}
