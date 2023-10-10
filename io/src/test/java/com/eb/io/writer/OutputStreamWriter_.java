package com.eb.io.writer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

@SpringBootTest
public class OutputStreamWriter_ {

    @Test
    public void writer1() throws Exception{

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("d:\\file\\OutputStreamWriter.txt"),"gbk");

        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("outputStreamWriter");

        bw.close();
    }
}
