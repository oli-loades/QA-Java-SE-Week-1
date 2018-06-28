package libary.tests;

import libary.models.*;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PersonTests {

    @Test
    public void createPerson(){
        Person p = new Person(1, "abc");
        assertTrue(p!=null);
    }

    @Test
    public void getAndSet(){
        Person p = new Person(1, "abc");
        assertEquals("abc", p.getName());
        p.setName("asd");
        assertEquals("asd", p.getName());
        assertEquals(1, p.getID());
    }

    @Test
    public void addItem(){
        Person p = new Person(1, "abc");

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));
        p.addItem(new Map(3,true,"abc","xyz"));

        assertEquals(3, p.getItemList().size());
    }

    @Test
    public void removeItem(){
        Person p = new Person(1, "abc");

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));

        p.removeItem(2);
        assertEquals(1, p.getItemList().size());

        p.removeItem(7);//does not exist
        assertEquals(1, p.getItemList().size());
    }

    @Test
    public void getItemList(){
        Person p = new Person(1, "abc");

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));

        List<Item> items = p.getItemList();

        assertEquals(2,items.size());
    }

    @Test
    public void clearItemList(){
        Person p = new Person(1, "abc");

        p.addItem(new Book(1,true,"abc","xyz"));
        p.addItem(new Newspaper(2,true,"oiu","tre"));

        p.clearItemList();
        assertEquals(0, p.getItemList().size());
    }

}
