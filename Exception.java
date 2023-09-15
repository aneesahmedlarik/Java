public class Exception {
    public static void main(String[] args) {
        /*System.out.println("hello world");
        System.out.println(6/2);
        System.out.println(4/2);
        System.out.println(4/0); // terminated else are un executed
        System.out.println(6/3);


        System.out.println("end");*/
        int x=4,y=0;

        try{
            int c=x/y;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("exception caught");
            System.out.println(e);
        }

        finally {
            System.out.println("this is final block");
        }

    }}