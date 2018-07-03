package libary.tests;

import libary.models.Newspaper;
import libary.models.NewspaperType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NewspaperTests {

    private Newspaper n;

    @Before
    public void setup(){
        n= new Newspaper(true,"oiu", NewspaperType.BROADSHEET);
    }
    @Test
    public void createNewspaper(){
        assertNotNull(n);
    }

    @Test
    public void abstractGetAndSet(){

        assertEquals(1, n.getID());

        assertEquals(true, n.isInStock());

        n.setInStock(false);
        assertEquals(false, n.isInStock());
    }

    @Test
    public void getAndSet(){

        assertEquals("oiu",n.getPublisher());

        assertEquals("BROADSHEET", n.getType().toString());

        n.setPublisher("abc");
        assertEquals("abc",n.getPublisher());

        n.setType(NewspaperType.TABLOID);
        assertEquals("TABLOID", n.getType().toString());
    }
}
