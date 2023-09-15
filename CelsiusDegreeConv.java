import java.util.*;
public class CelsiusDegreeConv {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.print("Enter Celsius degrees' value.");
        float cel=sc.nextFloat();
        float fah;
        fah= (float) (1.8*cel+32);
        System.out.println("celsius "+cel+" is = "+fah+" fahrenheit ");


    }

}
