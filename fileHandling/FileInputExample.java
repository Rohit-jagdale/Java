package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileInputExample {
    public static void main(String[] args) {
        // try (FileInputStream fis = new FileInputStream("/Users/rohit/Desktop/RohitJAVA/input.txt")) {
        //     int content;
        //     while ((content = fis.read()) != -1) {
        //         System.out.print((char) content);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        
        // String data = "Hello, FileOutputStream!";
        // try (FileOutputStream fos = new FileOutputStream("output.txt")) {
        //     fos.write(data.getBytes());
        //     System.out.println("Data written to file.");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        // try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
        //     String line;
        //     while ((line = br.readLine()) != null) {
        //         System.out.println(line);
        //     }
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"))) {
            bw.write("Hello, BufferedWriter!");
            bw.newLine();
            bw.write("This is the second line.");
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

