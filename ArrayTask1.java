package DataStructure.LabTasks;


public class ArrayTask1 {
    public static void printArray(int[] myArray){
        for(int i=0;i< myArray.length;i++){
            System.out.print(myArray[i]+" ");
        }
    }
public void arrayDemo(){
    int[] myArray= new int[5];
         myArray[0]=5;
         myArray[1]=1;
         myArray[2]=8;
         myArray[3]=2;
         myArray[4]=10;
         myArray[2]=9;
          printArray(myArray);
}

    public static void main(String[] args) {
        ArrayTask1 a=new ArrayTask1();
        a.arrayDemo();
    }
}
