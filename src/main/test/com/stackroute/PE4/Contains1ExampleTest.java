package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class Contains1ExampleTest {


    Contains1Example con;

    @Before
    public void setUp() throws Exception {
        con = new Contains1Example();
    }

    @After
    public void tearDown() throws Exception {
        con = null;
    }

    @Test
    public void FindCountTest() throws IOException {

        boolean expected=true;
        boolean unexpected=false;
        String str="This is Harry.";
        boolean actual= con.check(str);
        assertEquals("msg",expected,actual);
        assertNotEquals(unexpected,actual);
        assertNotNull(con);

    }
}