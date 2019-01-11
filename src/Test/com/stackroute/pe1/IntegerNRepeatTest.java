package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerNRepeatTest {
    IntegerNRepeat repint;

    @Before
    public void setUp() throws Exception {
        repint =new IntegerNRepeat();
    }

    @Test
    public void stringRepeat() {
        String answer= repint.stringRepeat("amrit",2);
        assertEquals("amrititit",answer);
    }

    @After
    public void tearDown() throws Exception {
        repint=null;
    }
}