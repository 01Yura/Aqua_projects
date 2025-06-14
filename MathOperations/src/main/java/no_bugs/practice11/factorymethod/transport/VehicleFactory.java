package no_bugs.practice11.factorymethod.transport;

public class VehicleFactory {

    public static Vehicle createVehicle(String typeOfVehicle) {
        Vehicle vehicle;
        if (typeOfVehicle.equalsIgnoreCase("bicycle")) {
            vehicle = new Bicycle();
        } else if (typeOfVehicle.equalsIgnoreCase("car")) {
            vehicle = new Car();
        } else {
            System.err.println("Unsupported vehicle!");
            vehicle = null;
        }
        return vehicle;
    }


}
