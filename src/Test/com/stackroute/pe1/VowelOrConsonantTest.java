package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelOrConsonantTest {
    VowelOrConsonant vowelorconso;

    @Before
    public void setUp() throws Exception {
        vowelorconso =new VowelOrConsonant();
    }

    @Test
    public void charVowelOrConsonant() {
        char[] inp={'a','i','b'};
        String answer= vowelorconso.charVowelOrConsonant(inp);
        assertEquals("VowelVowelConsonant",answer);
    }

    @After
    public void tearDown() throws Exception {
        vowelorconso=null;
    }
}