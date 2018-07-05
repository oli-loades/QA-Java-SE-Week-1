package Tests;

import models.*;
import org.junit.*;

import static org.junit.Assert.*;

public class PlayerTests {

    private Player player;

    @Before
    public void setup() {
        player = new Player(new Grid(3,3));
    }

    @Test
    public void createPlayer() {
        assertNotNull(player);
    }

    //addship
    //guess
}
