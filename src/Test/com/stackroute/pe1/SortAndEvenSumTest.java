package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SortAndEvenSumTest {
    SortAndEvenSum sortsum;
    private static final String inp="23451";
    ByteArrayInputStream input= new ByteArrayInputStream(inp.getBytes());

    @Before
    public void setUp() throws Exception {
        sortsum =new SortAndEvenSum();
        System.setIn(input);
    }

    @Test
    public void sortAndAddEven() {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(5,4,3,2,1));
        assertEquals(arr, sortsum.sortAndAddEven());
    }

    @Test
    public void findSum() {
        ArrayList<Integer> arr=new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
        assertEquals(6, sortsum.findSum(arr));
    }

    @After
    public void tearDown() throws Exception {
        sortsum=null;
    }
}