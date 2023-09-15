package Exception;
class UserdefinedException extends Exception{
    //compiled time exception
    UserdefinedException(String msg){
        super("you are under age");


    }
    }

public class CustomException {
    public static void main(String[] args) {

        int age = 19;
        try {
            if (age < 18) {

                throw new UserdefinedException("under age ");
            }
            else{
                System.out.println("aja voting dene");
            }
 } catch (UserdefinedException e) {
            System.out.println("caught  ");
            System.out.println(e);


        }
    }}