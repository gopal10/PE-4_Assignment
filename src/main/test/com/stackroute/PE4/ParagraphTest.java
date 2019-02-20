package com.stackroute.PE4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ParagraphTest {
    Paragraph paragraph;

    @Before
    public void setUp() throws Exception {
        paragraph = new Paragraph();
    }

    @After
    public void tearDown() throws Exception {
        paragraph = null;
    }

    @Test
    public void FindCountTest() throws IOException {

      ArrayList <String> Expected= new ArrayList<String>();
        Expected.add("abc");
        Expected.add("cde");
        String str="cde abc";
        ArrayList actual= paragraph.check(str);
        assertEquals(Expected,actual);
       // assertNotEquals(unexpected,actual);
        assertNotNull(paragraph);

    }

}