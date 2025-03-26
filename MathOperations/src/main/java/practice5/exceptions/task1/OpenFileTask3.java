package practice5.exceptions.task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//  Тут я использую конструкцию try-with-resources, которая автоматически закрывает fileReader, используя метод
// fileReader.close(). Но этот метод сам может выбрасывать исключение IOException, поэтому в первом блоке нужно ловить его
// а затем уже, можно точнее вывести сообщение определив точный класс исключения через instanceOf.

public class OpenFileTask3 {
    public static void main(String[] args) {
        File file = new File("G:\\Yura\\data.txt");

        try (FileReader fileReader = new FileReader(file)) {

        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.err.println("File not found!");
                e.getMessage();
            } else {
                System.out.println("Exception during work with file");
                e.getMessage();
            }
        }
    }
}
