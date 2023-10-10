package com.eb.io.writer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileWriter;
import java.io.IOException;

@SpringBootTest
public class FileWriter_ {

    @Test
    public void writer1(){

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("d:\\file\\writer.txt",true);
            fileWriter.write("ruai特ruai特");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
