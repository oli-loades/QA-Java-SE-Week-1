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
        Item.setCounter(0);
    }


    @Test
    public void createItemMNanager() {

        assertNotNull(im);
    }

    @Test
    public void addItem() {
        ItemManager im = new ItemManager();
        im.add(new Book( true, "abc", "xyz"));
        assertEquals(1, im.getList().size());
    }

    @Test
    public void removeItem() {
        im.add(new Book( true, "abc", "xyz"));
        im.remove(1);
        assertEquals(0, im.getList().size());
    }

    @Test
    public void updateItem() {
        im.add(new Book( true, "abc", "xyz"));
        im.update(1, new Book(true, "afj", "www"));
        assertEquals("www", ((Book) im.get(1)).getTitle());
    }

    @Test
    public void checkoutItem() {

    }

    @Test
    public void returnItem() {

    }

    @Test
    public void isEmpty() {
        assertTrue(im.isEmpty());
        im.add(new Book( true, "abc", "xyz"));
        assertFalse(im.isEmpty());
    }


}
