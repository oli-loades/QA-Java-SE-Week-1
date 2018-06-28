package libary.tests;

import libary.models.*;
import org.junit.Test;


import static org.junit.Assert.*;

public class PersonManagerTests {

    @Test
    public void creatPersonManager(){
        PersonManager pm = new PersonManager();
        assertNotNull(pm);
    }
    @Test
    public void addPerson(){
        PersonManager pm = new PersonManager();
        pm.add(new Person(1, "abc"));
        assertEquals(1, pm.getList().size());
    }

    @Test
    public void updatePerson(){
        PersonManager pm = new PersonManager();
        pm.add(new Person(1, "abc"));
        pm.update(1,  new Person(1, "asd"));
        assertEquals("asd", pm.get(1).getName());
    }

    @Test
    public void removePerson(){
        PersonManager pm = new PersonManager();
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
        assertTrue(new PersonManager().isEmpty());
    }

    @Test
    public void correctType(){
        PersonManager pm = new PersonManager();

        assertTrue(pm.isCorrectType(new Person(1, "asd")));

        assertFalse(pm.isCorrectType(new Book(1, true, "xyz","asd")));
    }

}
