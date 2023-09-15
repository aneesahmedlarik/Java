package Exception;

public class NestedTryException {
    public static void main(String[] args) {
        try{
            System.out.println("this is outer try");
            try{
                System.out.println(3/0);
            }catch(ArithmeticException A){
                System.out.println("exception caught.");
                System.out.println(A);
            }

        }catch(ArithmeticException e2){
            System.out.println("caught bs hanre");

        }
        System.out.println("this is end of the program.");


    }
}
