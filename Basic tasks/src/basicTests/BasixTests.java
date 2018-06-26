package basicTests;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static models.Main.blackjack;
import static models.Main.tooHot;
import static models.Main.uniqueSum;


public class BasixTests {

    @Test
    public  void blackjackTest1(){
        int a = 10;
        int b = 1;
        int expResult = 10;
        int actualResult = blackjack(a,b);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void blackjackTest2(){
        int a = 10;
        int b = 18;
        int expResult = 18;
        int actualResult = blackjack(a,b);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void blackjackTest3(){
        int a = 22;
        int b = 18;
        int expResult = 18;
        int actualResult = blackjack(a,b);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void blackjackTest4(){
        int a = 23;
        int b = 26;
        int expResult = 0;
        int actualResult = blackjack(a,b);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void unqiueSumTest1(){
        int a,b,c;
        a = 1;
        b=2;
        c=3;
        int expResult = 6;
        int actualResult = uniqueSum(a,b,c);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void unqiueSumTest2(){
        int a,b,c;
        a = 2;
        b=2;
        c=3;
        int expResult = 3;
        int actualResult = uniqueSum(a,b,c);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void unqiueSumTest3(){
        int a,b,c;
        a = 4;
        b=4;
        c=4;
        int expResult = 0;
        int actualResult = uniqueSum(a,b,c);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void tooHotTest1(){
        int temp = 10;
        boolean isSummer = true;
        boolean expResult = false;
        boolean actualResult = tooHot(temp,isSummer);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void tooHotTest2(){
        int temp = 95;
        boolean isSummer = true;
        boolean expResult = true;
        boolean actualResult = tooHot(temp,isSummer);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void tooHotTest3(){
        int temp = 110;
        boolean isSummer = true;
        boolean expResult = false;
        boolean actualResult = tooHot(temp,isSummer);
        assertEquals(expResult,actualResult);
    }
    @Test
    public  void tooHotTest4(){
        int temp = 20;
        boolean isSummer = false;
        boolean expResult = false;
        boolean actualResult = tooHot(temp,isSummer);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void tooHotTest5(){
        int temp = 90;
        boolean isSummer = false;
        boolean expResult = true;
        boolean actualResult = tooHot(temp,isSummer);
        assertEquals(expResult,actualResult);
    }

    @Test
    public  void tooHotTest6(){
        int temp = 110;
        boolean isSummer = false;
        boolean expResult = false;
        boolean actualResult = tooHot(temp,isSummer);
        assertEquals(expResult,actualResult);
    }

}
