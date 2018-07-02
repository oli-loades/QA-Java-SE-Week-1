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
    }

    @Test
    public void creatPersonManager(){

        assertNotNull(pm);
    }
    @Test
    public void addPerson(){
        pm.add(new Person(1, "abc"));
        assertEquals(1, pm.getList().size());
    }

    @Test
    public void updatePerson(){
        pm.add(new Person(1, "abc"));
        pm.update(1,  new Person(1, "asd"));
        assertEquals("asd", pm.get(1).getName());
    }

    @Test
    public void removePerson(){
        pm.add(new Person(1, "abc"));
        pm.add(new Person(2, "xyz"));
        pm.delete(1);
        assertEquals(1, pm.getList().size());
    }

    @Test
    public void checkOutItem(){

    }

    @Test
    public void returnItem(){

    }

    @Test
    public void isEmpty(){
        assertTrue(pm.isEmpty());
    }


}
