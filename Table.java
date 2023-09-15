import java.util.*;
public class Table {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

        System.out.println("enter any number till Table");
        int n= sc.nextInt();



        System.out.println("Tables till "+ n);
        for(int i=1;i<120;i++){
            System.out.print("*");
        }
        for(int j=2;j<=n;j++){
        System.out.println("\n");
        for(int i=1;i<11;i++){
            System.out.println(j+ " * "+i+" = "+(j*i));
        }
    }}
}
