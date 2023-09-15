public class OverloadingMethod {
    public static int plusMethod(int x, int y ){

         return x+y;}
    public static double plusMethod(double x, double y ){
         return x+y;}


    public static void main(String[] args) {
    int a=plusMethod(3,5);
    double b=plusMethod(3.5,5.56);
        System.out.println("for int: "+a);
        System.out.println("for double: "+b);
    }
}
