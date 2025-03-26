package my_tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\Yura\\data.txt");
        FileInputStream fis = new FileInputStream(file);
        System.out.println(fis.read());
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(100);
    }
}
