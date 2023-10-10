package com.eb.io.moveFile;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
public class Move {
    @Test
    public void Test(){
        String path = "d:\\file\\Group2";
        String outPath = "d:\\file\\Group2_";
        String dirPath = "";
        String dirPath2 = "";
        String dirPath3 = "" ;
        File file = new File(path);
        File pathFile = null;
        File pathFile2 = null;
        byte[] bytes = new byte[1024*1024];

        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        if (file.isDirectory()){
            String[] PathList = file.list();
            for (String s : PathList){
                dirPath = path + "\\" + s;
                pathFile = new File(dirPath);
                if (pathFile.isDirectory()) {
                    String[] pathFileList = pathFile.list();
                    for (String s1 : pathFileList) {
                        dirPath2 = dirPath + "\\" + s1;
                        pathFile2 = new File(dirPath2);
                        if (pathFile2.isDirectory()) {
                            String[] pathFile2List = pathFile2.list();
                            for (String s2 : pathFile2List) {
                                dirPath3 = dirPath2 + "\\" + s2;
                                try {
                                    bufferedInputStream = new BufferedInputStream(new FileInputStream(new File(dirPath3)));
                                    bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(new File(outPath + "\\" + s2),true));
                                    for (int i = bufferedInputStream.read(bytes); i != -1; i = bufferedInputStream.read(bytes)) {
                                        bufferedOutputStream.write(bytes,0,i);
                                    }
                                } catch (FileNotFoundException e) {
                                    e.printStackTrace();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                System.out.println(dirPath3);
                            }
                        }
                    }
                }
            }
        }


        try {
            bufferedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
