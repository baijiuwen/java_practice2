package com.eb.io.outputStream;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootTest
public class FileOutputStream_ {

    @Test
    public void output1(){
        FileOutputStream fileOutputStream = null;
        try {

            // append 将字节追加到文件后
            fileOutputStream = new FileOutputStream("d:\\file\\a.txt",true);

            fileOutputStream.write("汉字文学".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
