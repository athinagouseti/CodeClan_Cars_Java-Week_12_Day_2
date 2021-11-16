import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Car;
import vehicle.ElectricCar;
import vehicle.FuelType;
import vehicle.HybridCar;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    ElectricCar electricCar;
    HybridCar hybridCar;
    Customer customer;


    @Before
    public void before(){
        dealership = new Dealership(2000);
        car = new Car(500, "yellow", 4, FuelType.PETROL, 5);
        electricCar = new ElectricCar(1000, "white", 4, FuelType.ELECTRIC, 5);
        hybridCar = new HybridCar(800, "red", 4, FuelType.HYBRID, 5);
        customer = new Customer(1000);
    }

    @Test
    public void hasTill(){
        assertEquals(2000, dealership.getTill());
    }

    @Test
    public void startsEmptyStock(){
        assertEquals(0, dealership.getStockedVehicles());
    }

    @Test
    public void canAddCarToStock(){
        dealership.addVehicle(car);
        assertEquals(1, dealership.getStockedVehicles());
    }

    @Test
    public void canAddDifferentTypesToStock(){
        dealership.addVehicle(car);
        dealership.addVehicle(electricCar);
        dealership.addVehicle(hybridCar);
        assertEquals(3, dealership.getStockedVehicles());
    }

    @Test
    public void canSellVehicle(){
        dealership.addVehicle(car);
        dealership.sellVehicle(car, customer);
        assertEquals(0, dealership.getStockedVehicles() );
        assertEquals(2500, dealership.getTill());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buyVehicle(car);
        assertEquals(1, dealership.getStockedVehicles());
        assertEquals(1500, dealership.getTill());
    }

}
