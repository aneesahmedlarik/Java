import java.util.*; // importing library for cin and all
public class InputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //a way to be written while getting input
        System.out.println("enter first number: ");
        int a = sc.nextInt();// works as cin
        System.out.println("enter second number: ");
        int b= sc.nextInt();

        System.out.println("the addition is");
        System.out.println(a+b);
    }
}
