package homework_7.exceptions.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFound {
    public static void main(String[] args) {
        File file = new File("C:\\folder\\data.txt");

        try (FileReader fileReader = new FileReader(file)) {

        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("File not found!");
                System.out.println(e.getMessage());
            } else {
                System.out.println("There is another error!");
                System.out.println(e.getMessage());
            }
        }
    }
}
