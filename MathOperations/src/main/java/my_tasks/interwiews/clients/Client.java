package my_tasks.interwiews.clients;

public class Client {
    private static int count = 0;

    private String name;
    private int age;
    private boolean isActual;

    public Client(String name, int age, boolean isActual) {
        this.name = name;
        this.age = age;
        this.isActual = isActual;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Client client1 = new Client("Yuar", 1, true);
        Client client2 = new Client("wer", 2, false);
        Client client3 = new Client("sdf", 3, true);
        System.out.println(Client.getCount());
    }
}
