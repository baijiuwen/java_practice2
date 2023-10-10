package com.eb.io.writer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.io.PrintStream;

@SpringBootTest
public class PrintStream_ {

    @Test
    public void pring1() throws Exception{

        PrintStream ps = System.out;
        ps.println("lalalalala");
        ps.write("laalalalaa".getBytes());
        ps.close();

        System.setOut(new PrintStream("d:\\file\\printStream.txt"));
        System.out.println("printStream");

    }
}
