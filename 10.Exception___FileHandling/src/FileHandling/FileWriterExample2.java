package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample2 {
    public static void main(String[] args) {
        String fileName= "java.txt";

        try(FileWriter fileWriter = new FileWriter(fileName)){
            fileWriter.write("This is test for FileWriter class");
            fileWriter.flush();

        }catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
            System.out.println("Successful...");
        }
    }
}
