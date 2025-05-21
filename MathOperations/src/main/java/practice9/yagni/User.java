package practice9.yagni;

//3. Нарушение YAGNI (You Ain't Gonna Need It) – ненужный код
//Задача: Удалите неиспользуемые поля и оставьте только необходимые данные.
//Исходный код:

public class User {
    private String name;
    private String email;
    private String phoneNumber;
    private boolean isPremiumMember;
    private int rewardPoints;
    private String preferredLanguage;
    private String homeAddress;
    private String workAddress;
    private String socialSecurityNumber; // Никогда не используется

    public User(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}

//Fixed code, here we use only 3 fields
class UserFixed {
    private String name;
    private String email;
    private String phoneNumber;

    public UserFixed(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
