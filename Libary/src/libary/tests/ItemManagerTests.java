package libary.tests;

import libary.models.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class ItemManagerTests {

    private ItemManager im;

    @Before
    public void setup(){
         im = new ItemManager();
    }


    @Test
    public void createItemMNanager() {

        assertNotNull(im);
    }

    @Test
    public void addItem() {
        ItemManager im = new ItemManager();
        im.add(new Book(1, true, "abc", "xyz"));
        assertEquals(1, im.getList().size());
    }

    @Test
    public void removeItem() {
        ItemManager im = new ItemManager();
        im.add(new Book(2, true, "abc", "xyz"));
        im.delete(2);
        assertEquals(0, im.getList().size());
    }

    @Test
    public void updateItem() {
        ItemManager im = new ItemManager();
        im.add(new Book(2, true, "abc", "xyz"));
        im.update(2, new Book(2, true, "afj", "www"));
        assertEquals("www", ((Book) im.get(2)).getTitle());
    }

    @Test
    public void checkoutItem() {

    }

    @Test
    public void returnItem() {

    }

    @Test
    public void isEmpty() {
        ItemManager im = new ItemManager();
        assertTrue(im.isEmpty());
        im.add(new Book(2, true, "abc", "xyz"));
        assertFalse(im.isEmpty());
    }


}
