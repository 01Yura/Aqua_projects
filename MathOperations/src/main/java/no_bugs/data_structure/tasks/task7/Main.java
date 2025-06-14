package no_bugs.data_structure.tasks.task7;

//7. Упорядоченный список
//Необходимо хранить список чисел в отсортированном виде, чтобы быстро находить минимальное и максимальное значения.

public class Main {
    public static void main(String[] args) {
//        Create storage
        Storage storage = new Storage();
//        Populate storage and sort after each addition
        storage.addNumber(10);
        storage.addNumber(7);
        storage.addNumber(25);
        storage.addNumber(10);
        storage.addNumber(2);
//        Show storage
        storage.showStorage();
        System.out.println();
//        Show Max value
        storage.showMaxValue();
//        Show Min value
        storage.showMinValue();

    }
}
