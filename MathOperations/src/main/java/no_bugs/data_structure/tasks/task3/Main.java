package no_bugs.data_structure.tasks.task3;

//3. Хранение ключей и значений
//Необходимо хранить настройки приложения, где каждый параметр имеет имя (ключ) и значение.


public class Main {
    public static void main(String[] args) {
//        Create storage
        Storage storage = new Storage();
//        Create parameters
        Parameter parameter1 = new Parameter("Ping", "20ms");
        Parameter parameter2 = new Parameter("TTL", "128");
        Parameter parameter3 = new Parameter("InternetSpeed", "1Gbps");
//        Add parameters to storage
        storage.addParametr(parameter1);
        storage.addParametr(parameter2);
        storage.addParametr(parameter3);
//        Show storage
        storage.showStorage();
        System.out.println();
//        Remove parametr using name (key)
        storage.removeParameterUsingName("TTL");
        storage.showStorage();
        System.out.println();
//        Remove parametr using value (value)
        storage.removeParameterUsingValue("1Gbps");
        storage.showStorage();
        System.out.println();
    }
}
