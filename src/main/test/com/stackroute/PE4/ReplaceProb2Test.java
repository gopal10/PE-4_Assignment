package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class ReplaceProb2Test {

    ReplaceProb2 replaceProb2;

    @Before
    public void setUp() throws Exception {
        replaceProb2 = new ReplaceProb2();
    }

    @After
    public void tearDown() throws Exception {
        replaceProb2 = null;
    }

    @Test
    public void FindCountTest() throws IOException {

        String expected="faity fry";
        String unexpected="daily dry";
        String str="daily dry";
        String actual= replaceProb2.replaceprob(str);
        assertEquals("msg",expected,actual);
        assertNotEquals(unexpected,actual);
        assertNotNull(replaceProb2);
    }


}


