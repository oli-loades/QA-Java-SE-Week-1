package libary.tests;

import libary.models.Map;
import libary.models.MapType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MapTests {

    private Map m;
    @Before
    public void setup(){
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
