package com.leightondarkins;

import java.io.PrintStream;

public class ConsoleApplication {
    private final PrintStream out;

    public ConsoleApplication(PrintStream out) {
        this.out = out;
    }

    public void WriteToConsole(String value) {
        out.print(value);
    }

    public void WriteToConsoleWithNewLine(String value) {
        out.println(value);
    }
}
