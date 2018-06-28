package libary.tests;

import libary.models.Book;
import libary.models.Item;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BookTests {
    @Test
    public void createBook(){
        Item b = new Book(1,true,"abc","xyz");
        assertTrue(b!=null);
    }

    @Test
    public void abstractGetAndSet(){
        Item b = new Book(1,true,"abc","xyz");

        assertEquals(1, b.getID());

        assertEquals(true, b.isInStock());

        b.setInStock(false);
        assertEquals(false, b.isInStock());
    }

    @Test
    public void getAndSet(){
        Book b = new Book(1,true,"abc","xyz");

        assertEquals("abc", b.getAuthor());

        assertEquals("xyz", b.getTitle());

        b.setAuthor("123");
        assertEquals("123", b.getAuthor());

        b.setTitle("asd");
        assertEquals("asd", b.getTitle());
    }
}
