package Tests;

import models.*;
import org.junit.*;

import static org.junit.Assert.*;

public class ShipTests {

    private Ship ship;

    @Before
    public void setup(){
        ship = new Ship("abc",2);
    }

    @Test
    public void createShip(){
        assertNotNull(ship);
    }
}
