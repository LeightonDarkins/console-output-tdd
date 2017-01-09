package com.leightondarkins;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class ConsoleApplicationTest {

    private ConsoleApplication subject;
    private ByteArrayOutputStream outContent;
    private PrintStream outStream;

    @Before
    public void setup() {
        outContent = new ByteArrayOutputStream();
        outStream = new PrintStream((outContent));
        subject = new ConsoleApplication(outStream);
    }

    @After
    public void tearDown() {
        outContent = null;
        outStream = null;
        subject = null;
    }

    @Test
    public void oneShouldEqualOne() {
        assertEquals(1,1);
    }

    @Test
    public void WriteToConsole_ShouldWrite_Test() {
        subject.WriteToConsole();

        assertEquals("test", outContent.toString());
    }
}
