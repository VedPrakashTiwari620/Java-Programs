package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fileName = "example.txt";


        try(FileWriter writer = new FileWriter(fileName)){


            for (int i = 0; i < 100; i++) {
                writer.write("Hello, This is a test.\n");
            }


            writer.flush();

            System.out.println("Successfully.");


        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally {
//            writer.close();
        }
    }
}
