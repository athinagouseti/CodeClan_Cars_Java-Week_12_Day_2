package people;

import vehicle.Car;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(int money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public int getOwnedVehicles() {
        return this.ownedVehicles.size();
    }

    public void addOwnedVehicle(Vehicle vehicle) {
        this.ownedVehicles.add(vehicle);
    }

    public void pay(int amount){
        this.money -= amount;
    }

    public void buyVehicle(Vehicle vehicle) {
        if (this.getMoney() >= vehicle.getPrice() ){
            this.pay(vehicle.getPrice());
            this.addOwnedVehicle(vehicle);
        }

    }
}
