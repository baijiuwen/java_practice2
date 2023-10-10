package com.eb.io.inputStream;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class FileInputStream_ {

    @Test
    public void input1(){
        int read = 0;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("d:\\file\\hello.txt"));
            while((read=fileInputStream.read()) != -1){
                System.out.print((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void input2(){

        int read = 0;
        FileInputStream fileInputStream = null;
        byte[] bytes = new byte[5];
        try {
            fileInputStream = new FileInputStream(new File("d:\\file\\hello.txt"));
            while((read=fileInputStream.read(bytes)) != -1){
                System.out.print(new String(bytes,0,read));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
