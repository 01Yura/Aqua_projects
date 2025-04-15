package my_tasks;

public class Test14 {
    public static void main(String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

//        Оператор == вернет "false", так как сравниваются ссылки
        System.out.println(str1 == str2);

//        метод equals() вернет "true", так как он УЖЕ ПО УМОЛЧАНИЮ ПЕРЕОПРЕДЛЕН в классе String
//        и переопределять его не надо
        System.out.println(str1.equals(str2));

        
    }
}
