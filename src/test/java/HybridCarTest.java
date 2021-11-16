import org.junit.Before;
import org.junit.Test;
import vehicle.FuelType;
import vehicle.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar(800, "red", 4, FuelType.HYBRID, 5);
    }

    @Test
    public void hasPrice(){
        assertEquals(800, hybridCar.getPrice());
    }

    @Test
    public void hasColour(){
        assertEquals("red", hybridCar.getColour());
    }

    @Test
    public void hasWheels(){
        assertEquals(4, hybridCar.getWheels());
    }

    @Test
    public void hasFuelType(){
        assertEquals(FuelType.HYBRID, hybridCar.getFuelType());
    }

    @Test
    public void hasDoors(){
        assertEquals(5, hybridCar.getDoors());
    }
}
