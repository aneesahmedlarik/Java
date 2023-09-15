import java.util.*;
public class MarkSheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter marks of Physics= ");
        float p= sc.nextFloat();
        System.out.print("Enter marks of maths= ");
        float m= sc.nextFloat();
        System.out.print("enter marks of java= ");
        float j= sc.nextFloat();
        System.out.print("enter marks of discete= ");
        float d= sc.nextFloat();

        float t=p+m+j+d;
        System.out.print("total marks you got= "+ t);


        float per;
        per= (t/400)*100;

        System.out.print("your percentage is = "+ per);


    }
}
