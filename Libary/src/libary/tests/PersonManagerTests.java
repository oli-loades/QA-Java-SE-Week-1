package libary.tests;

import libary.models.*;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class PersonManagerTests {

    private PersonManager pm;

    @Before
    public void setup(){
        pm = new PersonManager();
        Person.retCounter(0);
        Item.setCounter(0);
    }

    @Test
    public void createPersonManager(){
        assertNotNull(pm);
    }
    @Test
    public void addPerson(){
        pm.add(new Person( "abc"));
        assertEquals(1, pm.getList().size());
    }

    @Test
    public void updatePerson(){
        pm.add(new Person( "abc"));
        pm.update(1,  new Person( "asd"));
        assertEquals("asd", pm.get(1).getName());
    }

    @Test
    public void removePerson(){

        pm.add(new Person( "xyz"));
        pm.remove(1);
        assertEquals(0, pm.getList().size());
    }

    @Test
    public void checkoutItem(){
        pm.add(new Person( "abc"));
        pm.checkoutItem(1,new Book(true,"a","b"));
        assertEquals(0,pm.get(1).getItemList().size());
    }

    @Test
    public void returnItem(){
        pm.add(new Person( "abc"));
        pm.checkoutItem(1,new Book(true,"a","b"));
        pm.returnItem(1,1);
        assertEquals(0,pm.get(1).getItemList().size());
    }

    @Test
    public void isEmpty(){
        assertTrue(pm.isEmpty());
    }


}
