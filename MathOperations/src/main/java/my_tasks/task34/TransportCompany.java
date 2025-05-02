package my_tasks.task34;

import java.util.ArrayList;
import java.util.Comparator;

public class TransportCompany {

    private ArrayList<Vehicle> availableVehicles;

    public TransportCompany() {

        this.availableVehicles = new ArrayList<>();
    }

    public ArrayList<Vehicle> getAvailableVehicles() {
        return availableVehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        this.availableVehicles.add(vehicle);
    }

    public ArrayList<Vehicle> showTransportForTrip(int numberOfPeople) throws AvailableTransportCapacityException {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        this.availableVehicles.sort(Comparator.comparing(Vehicle::getCapacity));

        int commonCapacity = 0;
        for (Vehicle vehicle : this.availableVehicles) {
            commonCapacity += vehicle.getCapacity();
        }

        if (commonCapacity < numberOfPeople) {
            throw new AvailableTransportCapacityException("You need more unit of vehicles");
        } else {
            int currentCapacity = 0;
            for (Vehicle vehicle : this.getAvailableVehicles()) {
                currentCapacity += vehicle.getCapacity();
                vehicles.add(vehicle);
                if (currentCapacity < numberOfPeople) continue;
                else break;
            }


        }
        return vehicles;
    }
}

