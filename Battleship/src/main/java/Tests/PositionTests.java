package Tests;

import models.*;
import org.junit.*;

import static org.junit.Assert.*;

public class PositionTests {
    private Position pos;

    @Before
    public void setup(){
        pos = new Position();
    }

    @Test
    public void createPosition(){
        assertNotNull(pos);
    }
}
