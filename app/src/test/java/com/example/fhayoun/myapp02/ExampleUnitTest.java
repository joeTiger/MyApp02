package com.example.fhayoun.myapp02;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void sub_isCorrect() throws Exception {
        assertEquals(4, 6 - 2);
    }
    @Test
    public void div_isCorrect() throws Exception {
        assertEquals(3, 6 / 2);
    }
}