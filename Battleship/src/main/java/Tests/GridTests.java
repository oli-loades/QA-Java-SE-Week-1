package Tests;

import models.*;
import org.junit.*;

import static org.junit.Assert.*;

public class GridTests {

    private Grid grid;

    @Before
    public void setup(){
        grid = new Grid(3,3);
    }

    @Test
    public void createGrid(){
        assertNotNull(grid);
    }


}
