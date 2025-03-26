package practice5.exceptions.task4;

//4. Создание и использование собственного непроверяемого исключения
//Условие задачи: Напишите функцию, которая принимает строку в качестве аргумента и проверяет, является ли строка правильным электронным адресом. Если строка не удовлетворяет критериям, функция должна выбрасывать непроверяемое исключение.

public class EmailChecker {

    public static void main(String[] args) throws IncorrectEmailException {
        EmailChecker emailChecker = new EmailChecker();
        try {
            emailChecker.isEmailValid("yura@mail.ru");
            System.out.println("Email is valid");
        } catch (IncorrectEmailException e) {
            System.out.println(e.getMessage());
        }

    }

    public boolean isEmailValid(String email) throws IncorrectEmailException {
        String emailValidRegexpPattern = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if (email.matches(emailValidRegexpPattern)) {
            return true;
        } else {
            throw new IncorrectEmailException("This email is not valid!");
        }
    }


}
