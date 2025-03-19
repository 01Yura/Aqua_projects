package my_tasks;

public class CheckStrings {
    public static void main(String[] args) {
        String st1 = new String("Hello");
        String st2 = new String("Hello");

//        String st1 = "Hello";
//        String st2 = "Hello";

        if (st1.equals(st2)) {
            System.out.println("EQUALS");
        } else {
            System.out.println("NOT");
        }

        System.out.println(st1);
        System.out.println(st2);
    }


}
