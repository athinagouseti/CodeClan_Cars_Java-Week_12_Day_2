package vehicle;

public abstract class Vehicle {
    private int price;
    private String colour;
    private int wheels;
    private FuelType fuelType;
    private int doors;

    public Vehicle(int price, String colour, int wheels, FuelType fuelType, int doors) {
        this.price = price;
        this.colour = colour;
        this.wheels = wheels;
        this.fuelType = fuelType;
        this.doors = doors;
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getWheels() {
        return wheels;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public int getDoors() {
        return doors;
    }
}
