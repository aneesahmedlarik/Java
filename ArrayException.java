package Exception;

public class ArrayException {
    public static void main(String[] args) {
        int [] arr={45,541,51,51};
        try{
            System.out.println(arr[5]);
        } catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("out of bound ");
            System.out.println(e.fillInStackTrace());
            System.out.println(e.getMessage());

        }


    }
}






