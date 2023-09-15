import java.io.*;

public class FileHandling {

        public static void main(String args[]) {
            try {
                int arr[] = {11,21,3,40,5};
                OutputStream os = new FileOutputStream("test.docx");
                File f = new File("C:\\Desktop");
                //InputStream f = new FileInputStream(f);

                for(int x = 0; x < arr.length ; x++) {
                    os.write( arr[x] ); // writes the bytes
                } os.close();
                InputStream is = new FileInputStream("test.docx");
                int size = is.available();
                for(int i = 0; i < size; i++) {
                    System.out.print((char)is.read() + " "); }
                is.close(); }
            catch (IOException e) { System.out.print("Exception"); } } }


