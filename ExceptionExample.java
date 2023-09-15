package Exception;

public class ExceptionExample {
    public static void divide_num(int x, int y) throws ArithmeticException{
        int c= x/y;
        System.out.println(c);

    }



    public static void main(String[] args) {

        try{
            divide_num(4,0);
        }catch(ArithmeticException e){
            System.out.println(" exception caught ");
            System.out.println(" program terminated ");
        }





    }


}
