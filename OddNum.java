import java.util.*;
public class OddNum {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("set an upper bound. ");
        int n= sc.nextInt();
        int [] odd=new int[n];
        for(int i=0;i<n;i++){
            odd[i]=2*i+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(odd[i]+" ");}
    }
}
