package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandlingExample {
    public static void main(String[] args) throws IOException {
        File myFile= new File("C:\\Users\\Student\\Desktop\\ Testing.txt"); //DesktopDesktop
      //  try {
          /*  if(myFile.createNewFile()){
                System.out.println("file has been created.");
            }
    else{
                System.out.println("couldn't");

            }*/

/*
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);



        }} catch (IOException e) {
            System.out.println("unable to print. ");
            throw new RuntimeException(e);
        }
*/
            if (myFile.delete()) {
                System.out.println("file has been deleted successfully");
            } else {
                System.out.println("there is some problem in deleting");
            }


        }}


