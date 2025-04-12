package my_tasks;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) throws IOException {
        try {
            FileReader fileReader = new FileReader("G:\\Yura\\data.txt");
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException has been caught");
        }
        
    }
}
