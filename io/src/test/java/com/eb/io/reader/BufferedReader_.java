package com.eb.io.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@SpringBootTest
public class BufferedReader_ {

    @Test
    public void buffered() throws IOException {

        FileReader fileReader = new FileReader("d:\\file\\Package4.java");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = "";
        while ((s = bufferedReader.readLine())!=null) {
            System.out.println(s);
        }


        bufferedReader.close();

    }
}
