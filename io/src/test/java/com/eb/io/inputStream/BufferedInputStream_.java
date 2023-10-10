package com.eb.io.inputStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;

@SpringBootTest
public class BufferedInputStream_ {

    @Test
    public void input1() throws Exception{

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\file\\hello.txt"));
        bufferedInputStream.read();

    }
}
