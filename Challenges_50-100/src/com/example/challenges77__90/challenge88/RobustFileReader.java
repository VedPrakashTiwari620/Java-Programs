package com.example.challenges77__90.challenge88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class RobustFileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the file you wish to read");
        String fileName=input.nextLine();

        try(FileReader fileReader = new FileReader(fileName)){
            int read;
            while ((read=fileReader.read()) != -1){
                System.out.print((char) read);
            }
        }catch (FileNotFoundException exception){
            System.out.println("Exception Occurred Not Found"+exception.getMessage());
        }catch (IOException exception){
            System.out.println("Exception Occurred "+exception.getMessage());
        }
    }
}
