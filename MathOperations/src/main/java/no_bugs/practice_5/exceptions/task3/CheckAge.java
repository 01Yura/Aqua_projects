package no_bugs.practice_5.exceptions.task3;

//3. Создание и использование собственного проверяемого исключения
//Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя. Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.


public class CheckAge {
    public static void main(String[] args) {
        CheckAge checkAge = new CheckAge();
        try {
            System.out.println(checkAge.isAgeValid(100));
            System.out.println("Your age is satisfying");
        } catch (IncompatibleAgeException e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean isAgeValid(int age) throws IncompatibleAgeException {
        if (age <= 0 || age > 150) {
            throw new IncompatibleAgeException("Entered age is less 0, or more than 150");
        } else {
            return true;
        }
    }
}
