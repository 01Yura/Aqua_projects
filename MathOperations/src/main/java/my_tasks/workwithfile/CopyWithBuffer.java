package my_tasks.workwithfile;


import java.io.*;

public class CopyWithBuffer {
    public static void main(String[] args) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("F:\\Yura\\data.txt")); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\Yura\\data2.txt"))) {
//            int c;
//            while ((c = bufferedReader.read()) != -1) {
//                bufferedWriter.write(c);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
