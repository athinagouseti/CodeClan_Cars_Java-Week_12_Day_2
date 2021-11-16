import people.Customer;
import vehicle.Car;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {
    private int till;
    private ArrayList<Vehicle> stockedVehicles;

    public Dealership(int till) {
        this.till = till;
        this.stockedVehicles = new ArrayList<>();
    }

    public int getTill() {
        return this.till;
    }

    public int getStockedVehicles() {
        return this.stockedVehicles.size();
    }

    public void addVehicle(Vehicle vehicle) {
        this.stockedVehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.stockedVehicles.remove(vehicle);
    }

    public void getPaid(int amount){
        this.till += amount;
    }

    public void pay(int amount){
        this.till -= amount;
    }

    public void sellVehicle(Vehicle vehicle, Customer customer) {
        customer.buyVehicle(vehicle);
        this.getPaid(vehicle.getPrice());
        this.removeVehicle(vehicle);
    }

    public void buyVehicle(Vehicle vehicle) {
        if (this.till > vehicle.getPrice()) {
            this.pay(vehicle.getPrice());
            this.addVehicle(vehicle);
        }
    }
}
