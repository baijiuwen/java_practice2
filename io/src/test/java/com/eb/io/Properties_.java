package com.eb.io;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@SpringBootTest
public class Properties_ {

    @Test
    public void pro1() throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("d:\\file\\mysql.properties"));

        String line = "";
        Map<String,String> map = new HashMap<>();
        String[] split = new String[2];
        while((line = br.readLine()) != null){
            split = line.split("=");
            map.put(split[0],split[1]);
        }
        br.close();
        System.out.println(map);
    }

    @Test
    public void file1() throws IOException {
        File file = new File("a.txt");
        file.createNewFile();

    }

    @Test
    public void pro2() throws Exception{

        Properties properties = new Properties();
        properties.load(new FileReader("d:\\file\\mysql.properties"));
        System.out.println(properties);
        properties.setProperty("name","李莉莉");
        properties.put("load",new Date().toString());
        properties.store(new FileOutputStream("d:\\file\\mysql.properties"),null);
        System.out.println(properties);
    }
}
