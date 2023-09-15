package DataStructure.Recursion;

public class Recursion {

    public static void printa(int n){
        //base condition
        if(n==0){
            return;
        }
        System.out.print(n+" ");
    printa(n-1);
    }
    public static void printd(int n){
        //base condition
        if(n==11){
            return;
        }
        System.out.print(n+" ");
        printd(n+1);
    }


    public static void main(String[] args) {
        printa(10);
        System.out.println();
        printd(1);
    }

}
