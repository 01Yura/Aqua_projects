package no_bugs.practice11.factorymethod.transport;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.createVehicle("car");
        vehicle.transport();
    }
}
