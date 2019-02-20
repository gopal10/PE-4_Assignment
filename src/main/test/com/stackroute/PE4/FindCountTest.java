package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class FindCountTest {
    FindCount findCount;

    @Before
    public void setUp() throws Exception {
        findCount = new FindCount();
    }

    @After
    public void tearDown() throws Exception {
        findCount = null;
    }

    @Test
    public void FindCountTest() throws IOException {

        int expected=4;
        int unexpected=1;
        String str="This is line about chararcter i";
        int actual= findCount.Countof(str,"i");
        assertEquals("msg",expected,actual);
        assertNotEquals(unexpected,actual);
        assertNotNull(findCount);
    }


}