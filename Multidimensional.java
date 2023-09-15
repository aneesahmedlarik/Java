import java.util.*;
public class Multidimensional {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("enter the rows = ");
        int rows=sc.nextInt();
        System.out.print("enter the columns = ");
        int col=sc.nextInt();
        int [][] multiD=new int [rows][col];
        for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            System.out.println("enter the number at location ["+i+"]"+"["+j+"]");
            multiD[i][j]=sc.nextInt();
        }   }
        System.out.println("result ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(multiD[i][j]+" ");
    }
            System.out.println();
        }
    }}
