package com.leightondarkins;

public class Main {
    public static void main(String[] args) {
        ConsoleApplication app = new ConsoleApplication(System.out);

        app.WriteToConsoleWithNewLine("test");
        app.WriteToConsole("banana");
        app.WriteToConsole("cheese");
    }
}
