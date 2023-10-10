package com.eb.io.file;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class FileInformation {

    @Test
    public void info1() {

        File file = new File("d:\\file\\file1.txt");
        System.out.println("文件名称：" + file.getName());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父级目录：" + file.getParent());
        System.out.println("文件大小（字节）：" + file.length());
        System.out.println("文件是否存在:" + file.exists());
        System.out.println("是否是一个文件：" + file.isFile());
        System.out.println("是否是一个目录：" + file.isDirectory());
    }

}
