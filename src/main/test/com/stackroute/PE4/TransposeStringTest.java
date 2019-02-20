package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TransposeStringTest {

    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString = new TransposeString();
    }

    @After
    public void tearDown() throws Exception {
        transposeString = null;
    }

    @Test
    public void FindCountTest() throws IOException {

        String expected="a kciuq nworb xof spmuj revo eht yzal god";
        String unexpected="a quick brown fox jumps over the lazy dog";
        String str="a quick brown fox jumps over the lazy dog";
        String actual= transposeString.check(str);
        assertEquals("msg",expected,actual);
      assertNotEquals(unexpected,actual);
        assertNotNull(transposeString);
    }

}