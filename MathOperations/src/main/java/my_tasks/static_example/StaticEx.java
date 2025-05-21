package my_tasks.static_example;

public class StaticEx {

    String name;
    int age;

    public static void main(String[] args) {
        StaticEx staticEx = new StaticEx();
        staticMethod();
        staticEx.staticMethod();
        StaticEx.staticMethod();
    }

    public static void staticMethod() {
        StaticEx ex = new StaticEx();
        System.out.println("ex.name = " + ex.name);
        System.err.println(ex.age);
        System.out.println("Hello from static method");
    }
}
