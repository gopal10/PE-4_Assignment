package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class MultipleOccuranceTest {


    MultipleOccurance app;

    @Before
    public void setUp() throws Exception {
        app = new MultipleOccurance();
    }

    @After
    public void tearDown() throws Exception {
        app = null;
    }

    @Test
    public void FindCountTest() throws IOException {

        String expected="4-6 10-12 27-29";
        String unexpected="a quick brown fox jumps over the lazy dog";
        String str="She sells seashells by the seashore";
        String input="se";
        String actual= app.check(str, input);
        assertEquals("msg",expected,actual);
        assertNotEquals(unexpected,actual);
        assertNotNull(app);
    }


}