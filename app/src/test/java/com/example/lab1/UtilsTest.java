package com.example.lab1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UtilsTest {
    @Test
    public void max_correct_one_value() {
        assertEquals(5, Utils.max(5));
    }
    @Test
    public void max_correct_two_values() {
        assertEquals(5, Utils.max(5, 0));
    }
    @Test
    public void max_correct_three_values() {
        assertEquals(10, Utils.max(5, 10, 1));
    }
    @Test
    public void max_correct_many_values() {
        assertEquals(100, Utils.max(2, 66, 22, 1, 66, 100, 100, 99));
    }
    @Test
    public void max_correct_negative_value() {
        assertEquals(-10, Utils.max(-50, -20, -10, -99));
    }
    @Test
    public void min_correct_one_value() {
        assertEquals(5, Utils.min(5));
    }
    @Test
    public void min_correct_two_values() {
        assertEquals(0, Utils.min(5, 0));
    }
    @Test
    public void min_correct_three_values() {
        assertEquals(1, Utils.min(5, 10, 1));
    }
    @Test
    public void min_correct_many_values() {
        assertEquals(1, Utils.min(2, 66, 22, 1, 66, 100, 100, 99));
    }
    @Test
    public void min_correct_negative_value() {
        assertEquals(-99, Utils.min(-50, -20, -10, -99));
    }
}

