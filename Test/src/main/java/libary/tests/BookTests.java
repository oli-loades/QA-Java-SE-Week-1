package libary.tests;

import libary.models.Book;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BookTests {

    private Book b;

    @Before
    public void setup(){
        b = new Book(1,true,"abc","xyz");
    }

    @Test
    public void createBook(){
        assertNotNull(b);
    }

    @Test
    public void abstractGetAndSet(){

        assertEquals(1, b.getID());

        assertEquals(true, b.isInStock());

        b.setInStock(false);
        assertEquals(false, b.isInStock());
    }

    @Test
    public void getAndSet(){

        assertEquals("abc", b.getAuthor());

        assertEquals("xyz", b.getTitle());

        b.setAuthor("123");
        assertEquals("123", b.getAuthor());

        b.setTitle("asd");
        assertEquals("asd", b.getTitle());
    }
}
