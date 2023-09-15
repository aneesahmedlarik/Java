import java.util.Scanner;

public class SearchingIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size= sc.nextInt();
        int array[]=new int[size];

        System.out.println("Enter Elements of array");

        for (int i=0; i<size; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter element in array to search");
        int element=sc.nextInt();
        for (int i=0; i< array.length; i++){
            if(element==array[i]){
                System.out.println("Element "+element+"found at index"+i);
            }
        }

    }

}
