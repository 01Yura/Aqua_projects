package my_tasks.task34;

public class Main {
    public static void main(String[] args) throws AvailableTransportCapacityException {
        Bus bus = new Bus("Mercedes", "Ikarus", 40);
        bus.showInfo();
        System.out.println();

        Car car = new Car("Toyota", "Corolla", 4);
        Car car2 = new Car("Toyota", "Corolla", 4);
        Car car3 = new Car("Toyota", "Corolla", 4);
        car.showInfo();
        System.out.println();

        TransportCompany transportCompany = new TransportCompany();
        transportCompany.addVehicle(bus);
        transportCompany.addVehicle(car);
        transportCompany.addVehicle(car2);
        transportCompany.addVehicle(car3);


        System.out.println(transportCompany.showTransportForTrip(1500));


    }
}
