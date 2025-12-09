package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAppMessage() {
        String expected = "Hello from Surya's CI/CD Pipeline!";
        String actual = App.mainMessage();
        assertEquals(expected, actual);
    }
}
