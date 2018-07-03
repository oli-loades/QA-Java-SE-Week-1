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
    public void setup() {
        p = new Person("abc");
        Person.retCounter(0);
        Item.setCounter(0);
    }

    @Test
    public void createPerson() {
        assertNotNull(p);
    }

    @Test
    public void getAndSet() {
        assertEquals("abc", p.getName());
        p.setName("asd");
        assertEquals("asd", p.getName());
        assertEquals(1, p.getID());
    }

    @Test
    public void addItem() {

        p.addItem(new Book(true, "abc", "xyz"));
        p.addItem(new Newspaper(true, "oiu", NewspaperType.BROADSHEET));
        p.addItem(new Map(true, MapType.TOPOGRAHIC, "xyz"));

        assertEquals(3, p.getItemList().size());
    }

    @Test
    public void removeItem() {

        p.addItem(new Book(true, "abc", "xyz"));
        p.addItem(new Newspaper(true, "oiu", NewspaperType.BROADSHEET));

        p.removeItem(2);
        assertEquals(1, p.getItemList().size());

        p.removeItem(7);//does not exist
       assertEquals(1, p.getItemList().size());
    }

    @Test
    public void getItemList() {

        p.addItem(new Book(true, "abc", "xyz"));
        p.addItem(new Newspaper(true, "oiu", NewspaperType.BROADSHEET));

        List<Item> items = p.getItemList();

        assertEquals(2, items.size());

    }

    @Test
    public void clearItemList() {

        p.addItem(new Book(true, "abc", "xyz"));
        p.addItem(new Newspaper(true, "oiu", NewspaperType.BROADSHEET));

        p.clearItemList();
        assertEquals(0, p.getItemList().size());
    }

    @Test
    public void toStringTest() {
        assertEquals("ID: 1 name: abc", p.toString());
    }
}
