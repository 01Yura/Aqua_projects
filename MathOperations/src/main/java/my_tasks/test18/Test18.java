package my_tasks.test18;

public class Test18 {
    public static void main(String[] args) {

        String text = "Hello from java 8";

        calculateLength(text);
        calculateLength("hi");
        calculateLength("");
    }

    public static int calculateLength(String s) {
        return (s.split(" ")).length;
    }


}
