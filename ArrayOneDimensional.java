import java.util.*;
import java.util.Arrays;
public class ArrayOneDimensional{
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter upper bound of Array named marks= ");
        int size= sc.nextInt();
        int [] marks=new int[size];
        for(int i=0;i< marks.length;i++){
        System.out.println("store marks at location ( "+i+" )"+ " = ");
         marks[i]=sc.nextInt();}
           Arrays.sort(marks);
        System.out.println("After sorting.");
       for (int i=0;i<size;i++){
           System.out.println("marks at location ( "+i+" )"+ " = "+ marks[i]);
    }
}}
