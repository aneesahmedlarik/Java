import java.util.Arrays;
import java.util.*;
public class MaxAndMinArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter upper bound of Array named marks= ");
        int size= s.nextInt();
        int [] marks=new int[size];
        for(int i=0;i< marks.length;i++){
            System.out.println("store marks at location ( "+i+" )"+ " = ");
            marks[i]=s.nextInt();}
            int max = Arrays.stream(marks).max().getAsInt();
            int min = Arrays.stream(marks).min().getAsInt();
            System.out.println("maximum value is "+ max);
            System.out.println("minimum value is "+ min);


}}
