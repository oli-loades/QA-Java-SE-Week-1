package Sentence;

import org.junit.*;

import static Sentence.Main.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test1(){
        assertEquals("Deepisodes of Deep Space Nine came on the televisionly after the news.",condense("Deep episodes of Deep Space Nine came on the television only after the news."));
    }

    @Test
    public void test2(){
        assertEquals("Digitalarm clockscarea children.",condense("Digital alarm clocks scare area children."));
    }


    @Test
    public void test3(){
        assertEquals(true, compare("Digital" ,"alarm",1));
    }
}
