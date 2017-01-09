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
    public void WriteToConsole_ShouldWrite_Test() {
        subject.WriteToConsole("test");

        assertEquals("test", outContent.toString());
    }

    @Test
    public void WriteToConsole_ShouldWrite_Banana() {
        subject.WriteToConsole("banana");

        assertEquals("banana", outContent.toString());
    }

    @Test
    public void Calling_WriteToConsole_MultipleTimes_Should_AddTheCorrectValuesToTheOutput() {
        subject.WriteToConsole("test");
        subject.WriteToConsole("banana");
        subject.WriteToConsole("cheese");

        assertEquals("testbananacheese", outContent.toString());
    }

    @Test
    public void WriteToConsoleWithNewLine_ShouldWrite_Test_WithNewLine() {
        subject.WriteToConsoleWithNewLine("test");

        assertEquals("test\n", outContent.toString());
    }

    @Test
    public void Callind_WriteToConsoleWithNewLine_MultipleTimes_Should_AddTheCorrectValuesToTheOutput() {
        subject.WriteToConsoleWithNewLine("test");
        subject.WriteToConsoleWithNewLine("banana");
        subject.WriteToConsoleWithNewLine("cheese");

        assertEquals("test\nbanana\ncheese\n", outContent.toString());
    }
}
