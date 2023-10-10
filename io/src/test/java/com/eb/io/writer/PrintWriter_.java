package com.eb.io.writer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

@SpringBootTest
public class PrintWriter_ {

    @Test
    public void print1() throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("printWriter");

        printWriter = new PrintWriter(new FileWriter("d:\\file\\printWriter.txt"));

        printWriter.println("printWriter");

        printWriter.close();
    }
}
