package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

@SpringBootTest
public class HomeWork {

    @Test
    public void test() throws Exception{


        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object o = constructor.newInstance("d:\\file\\reflection.txt");
        Method createNewFile = aClass.getMethod("createNewFile");
        createNewFile.invoke(o);
    }
}
