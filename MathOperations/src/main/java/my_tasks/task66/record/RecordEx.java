package my_tasks.task66.record;

public class RecordEx {
    public static void main(String[] args) {
        Person person = new Person("Max", 19);
        System.out.println(person);
    }


}

record Person(String name, int age) {
}


