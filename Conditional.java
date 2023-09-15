import java.util.*;
public class Conditional {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age; ");
        int a= sc.nextInt();
        if(a>=18) {
            System.out.println("you are eligible for CRC card ");
        } else {
            System.out.println("come back until and unless you became 18 ");
        }

    }
}
