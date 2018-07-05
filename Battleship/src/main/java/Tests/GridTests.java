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

    @Test
    public void addShipNorth(){
        assertEquals(true,grid.addShip(new Ship("xyz",2,1,1,Direction.NORTH)));
        assertEquals(false,grid.addShip(new Ship("xyz",2, 1,3,Direction.NORTH)));
    }

    @Test
    public void addShipEast() {
        assertEquals(true,grid.addShip(new Ship("xyz",2,1,1, Direction.EAST)));
        assertEquals(false,grid.addShip(new Ship("xyz",2,3,1,Direction.EAST)));
    }

    @Test
    public void addShipSouth(){
        assertEquals(true,grid.addShip(new Ship("xyz",2 ,2,2,Direction.SOUTH)));
        assertEquals(false,grid.addShip(new Ship("xyz",2, 1,1,Direction.SOUTH)));
    }

    @Test
    public void addShipWest(){
        assertEquals(true,grid.addShip(new Ship("xyz",2,2,2,Direction.WEST)));
        assertEquals(false,grid.addShip(new Ship("xyz",2,1,1,Direction.WEST)));
    }

    @Test
    public void addMoreShips(){
        grid.addShip(new Ship("xyz",2,1,1,Direction.NORTH));
        assertEquals(true,grid.addShip(new Ship("xyz",2,2,2,Direction.NORTH)));
        assertEquals(false,grid.addShip(new Ship("xyz",2,1,1,Direction.NORTH)));
        assertEquals(false,grid.addShip(new Ship("xyz",2,1,2,Direction.NORTH)));

        assertEquals(false,grid.addShip(new Ship("xyz",2,2,2,Direction.WEST)));
        assertEquals(true,grid.addShip(new Ship("xyz",2,3,1,Direction.WEST)));

    }

    @Test
    public void addMoreShips2(){
        grid.addShip(new Ship("xyz",2,3,3,Direction.SOUTH));

       assertEquals(false,grid.addShip(new Ship("xyz",2,3,2,Direction.SOUTH)));

        assertEquals(false,grid.addShip(new Ship("xyz",2,2,2,Direction.EAST)));
        assertEquals(true,grid.addShip(new Ship("xyz",2,1,2,Direction.EAST)));
    }


}
