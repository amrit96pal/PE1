package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterTypeTest {
    CharacterType chartest;

    @Before
    public void setUp() throws Exception {
        chartest =new CharacterType();
    }

    @Test
    public void characterDependentOutput() {
        String answer= chartest.characterDependentOutput('A');
        assertEquals("Upper Case",answer);
    }

    @After
    public void tearDown() throws Exception {
        chartest=null;
    }
}