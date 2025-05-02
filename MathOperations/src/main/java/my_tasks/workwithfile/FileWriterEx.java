package my_tasks.workwithfile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String string = "Земля в иллюминаторе, земля в иллюминаторе,\n" +
                "Земля в иллюминаторе видна...\n" +
                "Как сын грyстит о матери, как сын грyстит о матери,\n" +
                "Грyстим мы о земле - она одна.\n\n";

        try (FileWriter writer = new FileWriter("F:\\Yura\\data.txt", true);) {
            writer.write(string);
            writer.write("Hello!");
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
