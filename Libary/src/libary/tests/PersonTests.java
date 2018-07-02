package libary.tests;

import libary.models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTests {

    private Person p;

    @Before
    public void setup(){
        p = new Person(1, "abc");
    }

    @Test
    public void createPerson(){
        assertNotNull(p);
    }

    @Test
    public void getAndSet(){
        assertEquals("abc", p.getName());
        p.setName("asd");
        assertEquals("asd", p.getName());
        assertEquals(1, p.getID());
    }

    @Test
    public void addItem(){

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));
        p.addItem(new Map(3,true,"abc","xyz"));

        assertEquals(3, p.getItemList().size());
    }

    @Test
    public void removeItem(){

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));

        p.removeItem(2);
        assertEquals(1, p.getItemList().size());

        p.removeItem(7);//does not exist
        assertEquals(1, p.getItemList().size());
    }

    @Test
    public void getItemList(){

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));

        List<Item> items = p.getItemList();

        assertEquals(2,items.size());
    }

    @Test
    public void clearItemList(){

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));

        p.clearItemList();
        assertEquals(0, p.getItemList().size());
    }

    @Test
    public void toStringTest(){
        assertEquals("ID: 1 name: abc",p.toString());
    }
}
