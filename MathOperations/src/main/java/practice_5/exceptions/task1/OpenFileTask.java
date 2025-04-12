package practice_5.exceptions.task1;

//1. Обработка проверяемого исключения
//Условие задачи:
//Напишите программу, которая пытается открыть файл с именем "data.txt". Если файл не найден, программа должна обработать исключение и вывести сообщение: "Файл не найден".


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OpenFileTask {
    public static void main(String[] args) {
        File file = new File("G:\\Yura\\data.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.err.println("File \"" + file + "\" have not been found!");
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


}
