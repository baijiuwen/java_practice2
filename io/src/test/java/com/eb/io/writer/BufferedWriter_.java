package com.eb.io.writer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootTest
public class BufferedWriter_ {

    @Test
    public void writer1() throws IOException {

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\file\\bufferedWriter.txt",true));

        bufferedWriter.write("啦啦啦啦啦啦");
        bufferedWriter.newLine();
        bufferedWriter.write("哈哈哈哈哈哈哈");
        bufferedWriter.close();

    }
}
