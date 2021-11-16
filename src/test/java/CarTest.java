import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.FuelType;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car car;

    @Before
    public void before(){
        car = new Car(500, "blue", 4, FuelType.PETROL, 5);
    }

    @Test
    public void hasPrice(){
        assertEquals(500, car.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("blue", car.getColour());
    }

    @Test
    public void hasWheels(){
        assertEquals(4, car.getWheels());
    }

    @Test
    public void hasFuelType(){
        assertEquals(FuelType.PETROL, car.getFuelType());
    }

    @Test
    public void hasDoors(){
        assertEquals(5, car.getDoors());
    }
}
