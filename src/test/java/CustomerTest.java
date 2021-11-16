import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Car;
import vehicle.FuelType;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;

    @Before
    public void before(){
        customer = new Customer(1000);
        car = new Car(500, "purple", 4, FuelType.PETROL, 5);
    }

    @Test
    public void hasMoney(){
        assertEquals(1000, customer.getMoney());
    }

    @Test
    public void emptyOwnedVehicles(){
        assertEquals(0, customer.getOwnedVehicles());
    }

    @Test
    public void canAddOwnedVehicle(){
        customer.addOwnedVehicle(car);
        assertEquals(1, customer.getOwnedVehicles());
    }

    @Test
    public void customerCanBuyVehicle(){
        customer.buyVehicle(car);
        assertEquals(1, customer.getOwnedVehicles());
        assertEquals(500, customer.getMoney());
    }
}
