package libary.tests;

import libary.models.Item;
import libary.models.Newspaper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NewspaperTests {
    @Test
    public void createNewspaper(){
        Item n= new Newspaper(1,true,"oiu","tre");
        assertTrue(n!=null);
    }

    @Test
    public void abstractGetAndSet(){
        Item n= new Newspaper(1,true,"oiu","tre");

        assertEquals(1, n.getID());

        assertEquals(true, n.isInStock());

        n.setInStock(false);
        assertEquals(false, n.isInStock());
    }

    @Test
    public void getAndSet(){
        Newspaper n = new Newspaper(1,true,"oiu","tre");

        assertEquals("oiu",n.getPublisher());

        assertEquals("tre", n.getType());

        n.setPublisher("abc");
        assertEquals("abc",n.getPublisher());

        n.setType("xyz");
        assertEquals("xyz", n.getType());
    }
}
