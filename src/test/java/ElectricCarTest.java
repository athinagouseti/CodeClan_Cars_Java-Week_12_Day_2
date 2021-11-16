import org.junit.Before;
import org.junit.Test;
import vehicle.ElectricCar;
import vehicle.FuelType;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;

    @Before
    public void before(){
        electricCar = new ElectricCar(1000, "white", 4, FuelType.ELECTRIC, 5);
    }

    @Test
    public void hasPrice(){
        assertEquals(1000, electricCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("white", electricCar.getColour());
    }

    @Test
    public void hasWheels(){
        assertEquals(4, electricCar.getWheels());
    }

    @Test
    public void hasFuelType(){
        assertEquals(FuelType.ELECTRIC, electricCar.getFuelType());
    }

    @Test
    public void hasDoors(){
        assertEquals(5, electricCar.getDoors());
    }
}
