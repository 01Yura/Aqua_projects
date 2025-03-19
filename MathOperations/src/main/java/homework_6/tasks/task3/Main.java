package homework_6.tasks.task3;

public class Main {
    public static void main(String[] args) {
        Storage storage = new Storage();

        Parameter screenResolution = new Parameter("Screen Resolution", "1024x764");
        Parameter TTL = new Parameter("TTL", "128");
        Parameter bandwidth = new Parameter("Bandwidth", "10Gbps");

        storage.print();

        storage.addParametr(screenResolution);
        storage.addParametr(TTL);
        storage.addParametr(bandwidth);

        storage.print();
    }
}
