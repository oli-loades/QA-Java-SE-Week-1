package libary.tests;

import libary.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    private Library lib;

    @Before
    public void setup(){
        lib = new Library();
        Item.setCounter(0);
        Person.retCounter(0);
    }

    @Test
    public void createLibrary(){
        assertNotNull(lib);
    }

    @Test
    public void addItem(){
        lib.addItem(true,"abc","xyz");
        assertEquals(1,lib.getNumItems());
    }

    @Test
    public void updateItem(){
        lib.addItem(true,"abc","xyz");
        lib.addItem(true,NewspaperType.BROADSHEET,"xyz");
        lib.addItem(true,MapType.OCEANIC,"abc");

        lib.updateItem(1,true,"rty","xyz");
        assertEquals("rty",lib.getBook(1).getAuthor());


        lib.updateItem(2,true,NewspaperType.BROADSHEET,"fgh");
        assertEquals("fgh",lib.getNewspaper(2).getPublisher());


        lib.updateItem(3,true,MapType.OCEANIC,"xyz");
        assertEquals("xyz",lib.getMap(3).getRegion());
    }

    @Test
    public void removeItem(){
        lib.addItem(true,"abc","xyz");
        lib.addItem(true,"abc","xyz");
        lib.removeItem(1);
        assertEquals(1,lib.getNumItems());
    }

    @Test
    public void addPerson(){
        lib.addUser("abc");
        assertEquals(1,lib.getNumUsers());
    }

    @Test
    public void updatePerson(){
        lib.addUser("abc");
        lib.updateUser(1,"cde");
        assertEquals("cde",lib.getUser(1).getName());
    }

    @Test
    public void removePerson(){
        lib.addUser("abc");
        lib.removeUser(1);
        assertEquals(0,lib.getNumUsers());
    }

    @Test
    public void getBook(){
        lib.addItem(true,"abc","xyz");
        assertEquals("xyz",lib.getBook(1).getTitle());
    }

    @Test
    public void getMap(){
        lib.addItem(true,MapType.POPULATION,"abc");
        assertEquals("abc",lib.getMap(1).getRegion());
    }

    @Test
    public void getNewspaper(){
        lib.addItem(true,NewspaperType.TABLOID,"asd");
        assertEquals("asd",lib.getNewspaper(1).getPublisher());
    }

    @Test
    public void returnItem(){
        lib.addItem(true,"abc","xyz");
        lib.addUser("abc");
        lib.checkoutItem(1,1);
        lib.returnItem(1,1);
        assertEquals(true,lib.getBook(1).isInStock());
    }

    @Test
    public void checkoutItem(){
        lib.addItem(true,"abc","xyz");
        lib.addUser("abc");
        lib.checkoutItem(1,1);
        assertEquals(false,lib.getBook(1).isInStock());
    }


}
