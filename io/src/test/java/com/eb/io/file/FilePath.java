package com.eb.io.file;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author:
 * @date: 2023/10/7
 */
@SpringBootTest
public class FilePath {


    @Test
    public void getPath() throws IOException {
        File file = File.createTempFile("abcd",".xlsx");

        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());

        file = new File("abcd.xlsx");

        file.getName();

        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getCanonicalPath());


    }


}

