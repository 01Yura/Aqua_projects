package my_tasks.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Class employeeClass = Employee.class;
        String empClassName = employeeClass.getName();
        System.out.println(empClassName);

        Field[] array = employeeClass.getFields();
        System.out.println(Arrays.toString(array));

    }
}
