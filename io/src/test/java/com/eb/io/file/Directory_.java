package com.eb.io.file;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;

@SpringBootTest
public class Directory_ {

    @Test
    public void dir1(){
        String path = "d:\\file\\file1.txt";
        File file = new File(path);

        if (file.exists()){
            System.out.println(file.delete()?"删除成功":"删除失败");
        }else{
            System.out.println("文件不存在");
        }
    }

    @Test
    public void dir2(){
        String path = "d:\\file\\file1";
        File file = new File(path);

        if (file.exists()){
            System.out.println(file.delete()?"删除成功":"删除失败");
        }else{
            System.out.println("文件不存在");
        }

    }

    @Test
    public void dir3(){

        String path = "d:\\file\\file1\\a\\b\\c";
        File file = new File(path);

        if(file.exists()){
            System.out.println("该目录以存在");
        }else{
            System.out.println(file.mkdirs()?"目录创建成功":"目录创建失败");
        }
    }
}
