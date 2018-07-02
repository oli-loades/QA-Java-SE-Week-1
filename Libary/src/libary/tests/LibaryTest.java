package libary.tests;

import libary.models.Book;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class LibraryTest {

    private Library lib;

    @Before
    public void setup(){
        lib = new Library();
    }

    @Test
    public void createLibrary(){
        assertNotNull(lib);
    }

    @Test
    public void addItem(){
        lib.addItem(new Book());
    }

    @Test
    public void updateItem(){

    }

    @Test
    public void removeItem(){

    }

    @Test
    public void addPerson(){

    }

    @Test
    public void updatePerson(){

    }

    @Test
    public void removePerson(){

    }

    @Test
    public void getBook(){

    }

    @Test
    public void getMap(){

    }

    @Test
    public void getNewspaper(){

    }

    @Test
    public void returnItem(){

    }

    @Test
    public void checkoutItem(){

    }


}
