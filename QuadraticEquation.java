import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();

        int determinant;
    double root1,root2,root3;
        System.out.println("lets find first Determinant ");
        determinant=b*b-4*a*c;
        System.out.println("Determinant :"+determinant);

        root1=-b+Math.sqrt(determinant)/2*a;
        root2=-b-Math.sqrt(determinant)/2*a;

    if(determinant>0){
        System.out.println("Roots are Real");
        System.out.println("roo1 :" +root1);
        System.out.println("root2:"+root2);

    }
    else if(determinant==0){
        System.out.println("Roots are real and Equal");
    }

    else  {
        System.out.println("Roots are complex");
    }
    }


}
