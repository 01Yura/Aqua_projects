package my_tasks.lomboktest;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {
    String name;
    int age;

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Vasya", 15);

        System.out.println(person1);
        System.out.println(person2);

        System.out.println("person2 = " + person2);
    }
}
