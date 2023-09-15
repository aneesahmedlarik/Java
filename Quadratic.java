import java.util.*;
public class Quadratic {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
        System.out.println("solving quadratic equation ax^2+bx+c=0. ");
        System.out.println("assign value for a.");
        float a= sc.nextFloat();
        System.out.println("assign value for b.");
        float b= sc.nextFloat();
        System.out.println("assign value for c.");
        float c= sc.nextFloat();


          float det=b*b-4*a*c ;
          if(det>0){
              System.out.println("roots are real and different.");
          }
          else if (det==0 ) {
              System.out.println("roots are real and equal.");
              
          }
          else if(det<0){
              System.out.println("roots are complex and different. ");
          }

        float root1, root2;
        root1= (float) ((-b+ Math.sqrt(b*b-4*a*c))/(2*a));
        root2= (float) ((-b- Math.sqrt(b*b-4*a*c))/(2*a));


        System.out.println("positive root is "+root1);
        System.out.println("where as negative root is "+root2);

    }
}
