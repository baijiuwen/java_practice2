package com.eb.io.reader;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
public class InputStreamReader_ {

    @Test
    public void reader1(){

        try {
            InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\file\\OutputStreamWriter.txt"),"gbk");

            BufferedReader br = new BufferedReader(isr);
            System.out.println(br.readLine());
            br.close();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
