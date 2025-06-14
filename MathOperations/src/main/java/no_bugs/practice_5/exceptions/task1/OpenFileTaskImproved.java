package no_bugs.practice_5.exceptions.task1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//  Тут я использую конструкцию try-with-resources, которая автоматически закрывает fileReader, используя метод
//  fileReader.close(). Но этот метод сам может выбрасывать исключение IOException, поэтому нужно ловить его, а не FileNotFoundException

public class OpenFileTaskImproved {
    public static void main(String[] args) {
        File file = new File("G:\\Yura\\data.txt");
        try (FileReader fileReader = new FileReader(file)) {
            System.out.println("File is opened");
        } catch (IOException e) {
            System.err.println("File \"" + file + "\" have not been found!");
        }

    }
}
