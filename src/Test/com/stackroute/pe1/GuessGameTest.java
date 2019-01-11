package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class GuessGameTest {

    GuessGame guessgame;
    private static final String INPUT="34";
    private ByteArrayInputStream inputStream=new ByteArrayInputStream(INPUT.getBytes());

    @Before
    public void setUp() throws Exception {
        guessgame =new GuessGame();
        System.setIn(inputStream);
    }

    @Test
    public void guessNum() {
        int answer= guessgame.guessNum(34);
        assertEquals(34,answer);
    }

    @After
    public void tearDown() throws Exception {
        guessgame=null;
    }
}