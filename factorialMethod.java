import java.util.*;
public class factorialMethod {
public static int getFactorial(int x) {

    int factor=1;
    for (int i = x; i >= 1; i--) {
    factor*=i;

    }
    return factor;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any positive number = ");
        int x=sc.nextInt();
      int z=  getFactorial(x);
        System.out.println(x+" ! = "+z);
    }
}
