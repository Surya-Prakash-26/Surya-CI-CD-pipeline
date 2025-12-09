package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {

    @Test
    public void testMainOutput() {
        // Capture the console output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Call main method
        App.main(null);

        // Validate output
        assertEquals("Hello from Surya's CI/CD Pipeline!\n", outContent.toString());
    }
}
