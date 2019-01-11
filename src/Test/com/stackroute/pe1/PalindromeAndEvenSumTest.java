package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeAndEvenSumTest {
    PalindromeAndEvenSum palinsum;

    @Before
    public void setUp() throws Exception {
        palinsum =new PalindromeAndEvenSum();
    }

    @Test
    public void main() {
        int sum= palinsum.revAndAddEvenPlaces(1234321);
        assertEquals(1234321,sum);
    }

    @After
    public void tearDown() throws Exception {
        palinsum=null;
    }
}