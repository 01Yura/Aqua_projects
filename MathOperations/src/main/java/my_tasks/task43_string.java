package my_tasks;

public class task43_string {
    public static void main(String[] args) {
        String s = "Hello, my dear friend - Alex!";
        s = s.replaceAll("[\\s,.!-]+", " ");
        System.out.println(s);
        char[] array = s.toCharArray();

        System.out.println(s.contains("dear"));
    }

}
