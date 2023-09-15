import java.util.*;
public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter any 3 numbers to see the greatest one. ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int greatest= (a>b)?(a>c ?a:c):(b>c?b:c);
        int lowest= (a<b)?(a<c ?a:c):(b<c?b:c);
        System.out.println("greatest is= "+greatest);
        System.out.println("lowest is= "+lowest);
    }
}
