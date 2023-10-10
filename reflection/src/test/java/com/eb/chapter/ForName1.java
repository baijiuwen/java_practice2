package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

@SpringBootTest
public class ForName1 {

    @Test
    public void method_() throws Exception{

        Properties properties = new Properties();
        properties.load(new FileReader("re.properties"));
        String path = properties.getProperty("classfullpath");
        String methodName = properties.getProperty("method");

        Class aClass = Class.forName(path);
        Object o = aClass.newInstance();
        System.out.println(o.getClass());

        Method method = aClass.getMethod(methodName);
        method.invoke(o);

    }

    @Test
    public void field_() throws Exception{

        Properties properties = new Properties();
        properties.load(new FileReader("re.properties"));
        String path = properties.getProperty("classfullpath");

        Class aClass = Class.forName(path);
        Object o = aClass.newInstance();

        Field name = aClass.getField("age");
        System.out.println(name.get(o));


    }
    @Test
    public void constructor_() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("re.properties"));
        String path = properties.getProperty("classfullpath");
        Class aClass = Class.forName(path);
        Object o = aClass.newInstance();

        Constructor constructor = aClass.getConstructor();
        constructor.newInstance();

        Constructor constructor1 = aClass.getConstructor(String.class);
        constructor1.newInstance("cat");
    }

    @Test
    public void time_() throws Exception{

        m1();
        m2();
        m3(); //通过setAccessible(true) 取消访问检查提高效率
    }

    public void m1(){
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0 ; i<90000000 ; i++){
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public void m2() throws Exception{
        Class<?> aClass = Class.forName("com.eb.chapter.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0 ; i<90000000 ; i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public void m3() throws Exception{
        Class<?> aClass = Class.forName("com.eb.chapter.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0 ; i<90000000 ; i++){
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
