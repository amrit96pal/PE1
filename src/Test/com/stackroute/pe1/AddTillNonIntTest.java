package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class AddTillNonIntTest {
    AddTillNonInt tillnonint;
    private static final String str=" 2 4 2 6 5 a";
    private ByteArrayInputStream input=new ByteArrayInputStream(str.getBytes());

    @Before
    public void setUp() throws Exception {
        tillnonint =new AddTillNonInt();
        System.setIn(input);
    }


    @Test
    public void exitOnNotInt() {
        int sum= tillnonint.exitOnNotInt();
        assertEquals(17,sum);

    }

    @After
    public void tearDown() throws Exception {
        tillnonint=null;
    }
}