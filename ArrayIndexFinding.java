import java.util.Scanner;
public class ArrayIndexFinding{
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("enter upper bound of Array named marks= ");
            int size= sc.nextInt();
            int [] marks=new int[size];
            for(int i=0;i< marks.length;i++){
                System.out.println("store marks at location ( "+i+" )"+ " = ");
                marks[i]=sc.nextInt();

            }
            System.out.println("enter marks which are to be found from the array marks[] = ");
            int find=sc.nextInt();
            for (int i=0;i<size;i++){
                if (marks[i]==find){
                    System.out.println("at the given number = " +find+" it's location is= "+i);
                }
            }
        }}

