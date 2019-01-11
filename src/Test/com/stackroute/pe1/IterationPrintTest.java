package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class IterationPrintTest {
    IterationPrint iter;

    @Before
    public void setUp() throws Exception {
        iter =new IterationPrint();
    }

    @Test
    public void loopNumbersAndPrint() {
        ArrayList<Integer> answer= new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,3,4,4,4,4));
        ArrayList<Integer> result= iter.loopNumbersAndPrint(4);
        assertEquals(answer,result);
    }

    @After
    public void tearDown() throws Exception {
        iter=null;
    }
}