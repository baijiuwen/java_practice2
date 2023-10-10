package com.eb.io.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

@SpringBootTest
public class FileReader_ {

    @Test
    public void reader1(){

        FileReader fileReader = null;
        char[] chars = new char[2];
        int len = 0;

        try {
            fileReader = new FileReader("d:\\file\\Package4.java");
            while ((len=fileReader.read(chars)) != -1){
                System.out.print(new String(chars,0,len));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
