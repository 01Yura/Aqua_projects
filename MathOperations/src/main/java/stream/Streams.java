package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streams {

    public static void main(String[] args) {


//        Метод map()
        System.out.println("--------------------Работа метода map()-------------------");
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, "Hello", " world!");

        arrayList.stream().map(element -> element.length());

//        Метод collect(Collectors.toList())  в конце создает изменяемый список, если надо неизменяемый или не лпанируешь далее модифицировать список, то надо использовать toList()
        List<Integer> list2 = arrayList.stream().map(element -> element.length()).collect(Collectors.toList());
        System.out.println(list2);

//        Создание стрима из массива
        int[] array = {1, 3, 33, 9, 2};
//        В конце строки с помощью метода toArray мы преобразуем поток обратно в array.
        array = Arrays.stream(array).map(element -> {
            if (element % 3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();

        System.out.println(Arrays.toString(array));
        System.out.println();


//        Метод filter()
        System.out.println("--------------------Работа метода filter()-------------------");
        List<Integer> list3 = new ArrayList<>();
        Collections.addAll(list3, 2, 4, 5, 6, 88, 22, 5, 74, 12, 54, 8, 3, 6, 32, 65, 15, 18, 33, 2, 5, 8, 6, 2);
        List<Integer> list4 = list3.stream().filter(element -> element > 30 && element < 80).collect(Collectors.toList());
        System.out.println(list4);
        System.out.println();


//        Метод forEach()
        System.out.println("--------------------Работа метода forEach()-------------------");
        int[] array2 = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        Arrays.stream(array2).forEach(el -> System.out.println(el));
        System.out.println();
//        Это так называемый method reference, мы можем его использовать когда лямбда вызывает уже существующий метод
        Arrays.stream(array2).forEach(System.out::println);
//        Arrays.stream(array2).forEach(Класс::метод_класса);


//        Метод reduce()
        System.out.println("--------------------Работа метода reduce()-------------------");
//        Нужно использовать метод get() в конце так как reduce() возвращает Optional
        int result = list3.stream().reduce((accumulator, element) -> accumulator + element).get();
        System.out.println(result);

//        Тут мы задаем начальное значение accumulatora, в пред примере начальное значение равнялось первому элементу
        int result2 = list3.stream().reduce(100, (accumulator, element) -> accumulator + element);
        System.out.println(result2);

        ArrayList<String> arrayList2 = new ArrayList<>();
        Collections.addAll(arrayList2, "Hello", " world", " Gandon!");
        String result3 = arrayList2.stream().reduce((a, c) -> a + " " + c).get();
        System.out.println(result3);
        System.out.println();


        //        Метод sorted()
        System.out.println("--------------------Работа метода sorted()-------------------");
        int[] array3 = {1, 3, 33, 9, 2};
        array3 = Arrays.stream(array3).sorted().toArray();
        System.out.println(Arrays.toString(array3));

        Student st1 = new Student("Yura", 39, 5);
        Student st2 = new Student("Max", 10, 4);
        Student st3 = new Student("Vasya", 15, 10);
        Student st4 = new Student("Petya", 40, 7);

        List<Student> arrayList1 = new ArrayList<>();
        arrayList1.add(st1);
        arrayList1.add(st2);
        arrayList1.add(st3);

        arrayList1.forEach(System.out::println);
        arrayList1 = arrayList1.stream().sorted((x, y) -> x.getAge() - y.getAge()).collect(Collectors.toList());
        System.out.println(arrayList1);
        System.out.println();


//        Метод chaining
//        Нам надо из массива оставить только числа больше 5, затем поделить на 2 те, что делятся без остатка на 2, остальные не трогать, и вывести сумму всех получившихся чисел
        System.out.println("--------------------CHAINING-------------------");

        int[] array4 = {1, 4, 16, 13, 8, 9, 11, 10, 6, 21};
        int result4 = Arrays.stream(array4).filter(e -> e > 5).map(e -> {
            if (e % 2 == 0) {
                e = e / 2;
                return e;
            } else {
                return e;
            }
        }).reduce((accum, e) -> accum += e).getAsInt();

        System.out.println(result4);
        System.out.println();

//        Метод concat()
        System.out.println("--------------------Работа метода concat()-------------------");

        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> stream2 = Stream.of(6, 7, 8, 9, 10);
        Stream<Integer> stream3 = Stream.concat(stream1, stream2);
        stream3.forEach(System.out::println);
        System.out.println();


//        Метод distinct()
        System.out.println("--------------------Работа метода distinct()-------------------");

        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 1, 2, 3);
        list.stream().

                distinct().

                forEach(System.out::println);
        System.out.println();


//        Метод count()
        System.out.println("--------------------Работа метода count()-------------------");
        System.out.println(list.stream().distinct().count());
        System.out.println();


//        Метод peek()
        System.out.println("--------------------Работа метода peek()-------------------");
        System.out.println(list.stream().distinct().peek(System.out::println).count());
        System.out.println();


//        Метод flatMap()
        System.out.println("--------------------Работа метода flatMap()-------------------");
        Faculty mathFaculty = new Faculty("Math");
        Faculty economicFaculty = new Faculty("Economic");

        mathFaculty.addStudent(st1);
        mathFaculty.addStudent(st2);
        economicFaculty.addStudent(st3);
        economicFaculty.addStudent(st4);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(mathFaculty);
        faculties.add(economicFaculty);

//        faculties.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream().forEach(student -> System.out.println(student.getName())));


    }

}

class Student {
    String name;
    int age;
    int grade;

    public Student(String name, int age, int grade) {
        this.age = age;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + grade;
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && grade == student.grade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, grade);
    }
}

class Faculty {
    String name;
    List<Student> studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        this.studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public void addStudent(Student st) {
        this.studentsOnFaculty.add(st);

    }
}

