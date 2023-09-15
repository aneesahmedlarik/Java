import java.util.*;
public class JavaMethods {

    public static int sum( int x, int y){
       return x+y;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter 1st number. ");
        int x=sc.nextInt();
        System.out.println("enter 2nd number. ");
        int y=sc.nextInt();
        System.out.println("sum of the numbers "+x+" and "+y+" is "+sum(x,y));

    }
}
