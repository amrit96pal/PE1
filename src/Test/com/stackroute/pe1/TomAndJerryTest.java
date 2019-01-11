package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomAndJerryTest {
    TomAndJerry tomjerry;

    @Before
    public void setUp() throws Exception {
        tomjerry =new TomAndJerry();
    }

    @Test
    public void printOnRangeAndEven() {
        assertEquals("Jerry", tomjerry.printOnRangeAndEven(23));
    }

    @After
    public void tearDown() throws Exception {
        tomjerry=null;
    }
}