package DataStructure.LabTasks;
public class OddArray {
  public static  int[] removeEven(int[] array) {
       int odd=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2!= 0) {
            odd++;
            }
        }
        int updated[] = new int[odd];
        int index=0;
        for(int j=0;j< array.length;j++){
            if (array[j] % 2!= 0) {
            updated[index]=array[j];
            index++;
        }
    }
  return updated;}
    public static void printArray(int[] array){
      //  System.out.println("before removing even numbers...");
      for(int i=0;i< array.length;i++){
          System.out.print(array[i]+" ");
      }
        System.out.println( );
   }
 public static void main(String[] args) {
        int[] array={1,2,4,5,10,6,3};
        printArray(array);
        int[] result;
        result= removeEven(array);
        System.out.println("answer");

        printArray(result);


    }

    }

