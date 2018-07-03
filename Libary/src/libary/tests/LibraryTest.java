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
        lib.addItem(new Book(true,"abc","xyz"));
        assertEquals(1,lib.getNumItems());
    }

    @Test
    public void updateItem(){
        lib.addItem(new Book(true,"abc","xyz"));
        lib.addItem(new Newspaper(true,"xyz",NewspaperType.BROADSHEET));
        lib.addItem(new Map(true,MapType.OCEANIC,"abc"));

        lib.update(1,new Book(true,"rty","xyz"));
        assertEquals("rty",lib.getBook(4).getAuthor());


        lib.update(2,new Newspaper(true,"fgh",NewspaperType.BROADSHEET));
        assertEquals("fgh",lib.getNewspaper(5).getPublisher());


        lib.update(3,new Map(true,MapType.OCEANIC,"xyz"));
        assertEquals("xyz",lib.getMap(6).getRegion());
    }

    @Test
    public void removeItem(){
        lib.addItem(new Book(true,"abc","xyz"));
        lib.addItem(new Book(true,"abc","xyz"));
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

    @Test(expected = ClassCastException.class)
    public void getBook(){
        lib.addItem(new Book(true,"abc","xyz"));
        lib.addItem(new Map(true,MapType.POPULATION,"abc"));
        assertEquals("xyz",lib.getBook(1).getTitle());
        lib.getBook(2).getTitle();//exception thrown
    }

    @Test(expected = ClassCastException.class)
    public void getMap(){
        lib.addItem(new Map(true,MapType.POPULATION,"abc"));
        lib.addItem(new Book(true,"abc","xyz"));
        assertEquals("abc",lib.getMap(1).getRegion());
        lib.getMap(2).getRegion();//exception thrown
    }

    @Test(expected = ClassCastException.class)
    public void getNewspaper(){
        lib.addItem(new Newspaper(true,"asd",NewspaperType.TABLOID));
        lib.addItem(new Map(true,MapType.POPULATION,"abc"));
        assertEquals("asd",lib.getNewspaper(1).getPublisher());
        lib.getNewspaper(2).getPublisher();//exception thrown
    }

    @Test
    public void returnItem(){
        lib.addItem(new Book(true,"abc","xyz"));
        lib.addUser("abc");
        lib.checkoutItem(1,1);
        lib.returnItem(1,1);
        assertEquals(true,lib.getBook(1).isInStock());
    }

    @Test
    public void checkoutItem(){
        lib.addItem(new Book(true,"abc","xyz"));
        lib.addUser("abc");
        lib.checkoutItem(1,1);
        assertEquals(false,lib.getBook(1).isInStock());
    }


}
