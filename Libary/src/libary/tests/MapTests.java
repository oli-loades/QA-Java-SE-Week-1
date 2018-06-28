package libary.tests;

import libary.models.Item;
import libary.models.Map;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapTests {
    @Test
    public void createMap(){
        Item m = new Map(1,true,"abc","xyz");
        assertTrue(m!=null);
    }

    @Test
    public void abstractGetAndSet(){
        Item m = new Map(1,true,"abc","xyz");

        assertEquals(1, m.getID());

        assertEquals(true, m.isInStock());

        m.setInStock(false);
        assertEquals(false, m.isInStock());
    }

    @Test
    public void getAndSet(){
        Map m = new Map(1,true,"abc","xyz");

        assertEquals("abc",m.getType());

        assertEquals("xyz", m.getRegion());

        m.setType("hfg");
        assertEquals("hfg",m.getType());

        m.setRegion("yyy");
        assertEquals("yyy", m.getRegion());
    }
}
