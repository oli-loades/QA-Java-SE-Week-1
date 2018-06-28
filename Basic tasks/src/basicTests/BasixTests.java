package basicTests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static models.Main.*;

public class BasixTests {

    @Test
    public  void blackjackTest1(){
        assertEquals(10,blackjack(10,1));
        assertEquals(18,blackjack(10,18));
        assertEquals(0,blackjack(32,22));
    }


    @Test
    public  void unqiueSumTest1(){
        assertEquals(6,uniqueSum(1,2,3));
        assertEquals(3,uniqueSum(2,2,3));
        assertEquals(0,uniqueSum(4,4,4));
    }


    @Test
    public  void tooHotTest1(){
        assertEquals(false,tooHot(10,true));
        assertEquals(true,tooHot(95,true));
        assertEquals(false,tooHot(110,true));
        assertEquals(false,tooHot(20,false));
        assertEquals(true,tooHot(90,false));
        assertEquals(false,tooHot(110,false));
    }



}
