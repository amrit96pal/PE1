package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString rev;

    @Before
    public void setUp() throws Exception {
     rev = new ReverseString();
    }

    @Test
    public void reverseWithoutStringBuffer() {
       assertEquals("tirma", rev.reverseWithoutStringBuffer("amrit"));
    }

    @After
    public void tearDown() throws Exception {
        rev=null;
    }
}