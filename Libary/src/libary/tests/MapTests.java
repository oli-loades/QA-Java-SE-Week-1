package libary.tests;

import libary.models.*;

import org.junit.*;

import static org.junit.Assert.*;

public class MapTests {

    private Map m;
    @Before
    public void setup(){
        Item.setCounter(0);
        m = new Map(true, MapType.OCEANIC,"xyz");

    }
    @Test
    public void createMap(){
        assertNotNull(m);
    }

    @Test
    public void abstractGetAndSet(){

        assertEquals(1, m.getID());

        assertEquals(true, m.isInStock());

        m.setInStock(false);
        assertEquals(false, m.isInStock());
    }

    @Test
    public void getAndSet(){

        assertEquals("OCEANIC",m.getType().toString());

        assertEquals("xyz", m.getRegion());

        m.setType(MapType.WEATHER);
        assertEquals("WEATHER",m.getType().toString());

        m.setRegion("yyy");
        assertEquals("yyy", m.getRegion());
    }
}
