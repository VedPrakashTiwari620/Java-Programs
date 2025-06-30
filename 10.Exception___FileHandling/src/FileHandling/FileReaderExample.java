package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "java.txt";

        try(FileReader fileReader = new FileReader(fileName)){

            int read=0;
            do{
                read=fileReader.read();
                System.out.print((char) read);
            }while (read != -1);


        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
