public class MethodOverloadingEx {
    public static void main(String[] args) {


        method(2,2);
        method(4);
        method(2,4,6);
    }



    public static void method(int a, int b ) {
        System.out.println("method with two prameters "+a+" and "+b+" ");

    }
    public static void method(int a) {
        System.out.println("method with one prameter "+a+" ");

    }
    public static void method(int a, int b, int c) {
        System.out.println("method with three prameters "+a+" , "+b+" and "+c);

    }
}
