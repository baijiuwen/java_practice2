package com.eb.io.file;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;

@SpringBootTest
public class NewFile {

    @Test
    public void file1(){

        String path = "d:/file/file1.txt";
        File file = new File(path);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void file2(){
        File file = new File("d:/file");
        String path = "file2.txt";
        File newFile = new File(file, path);
        try {
            newFile.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void file3(){
        String path = "d:/file";
        String name = "file3.txt";

        File file = new File(path, name);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
