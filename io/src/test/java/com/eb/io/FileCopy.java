package com.eb.io;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
public class FileCopy {

    @Test
    public void fileInputStreamCopy(){

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        byte[] bytes = new byte[100];
        int len = 0;

        try {
            fileInputStream = new FileInputStream("d:\\file\\1.jpg");
            fileOutputStream = new FileOutputStream("d:\\file\\2.jpg");
            while ((len = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, len);
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
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void bufferedReaderCopy() throws Exception{

        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\file\\Package4.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\file\\Package5.java",true));

        String line = "";

        while((line=bufferedReader.readLine()) != null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }

    @Test
    public void bufferedInputStreamCopy() throws Exception{

        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\file\\1.jpg"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d:\\file\\3.jpg"));

        int len = 0;
        byte[] bytes = new byte[100];
        while((len=bufferedInputStream.read(bytes)) != -1){
            bufferedOutputStream.write(bytes,0,len);
        }

        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
