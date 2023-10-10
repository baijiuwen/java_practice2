package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

@SpringBootTest
public class ReflecAccessProperty {

    @Test
    public void field_() throws Exception{

        Class<?> aClass = Class.forName("com.eb.chapter.Student");
        Object o = aClass.newInstance();
        System.out.println(o);

        Field age = aClass.getField("age");
        age.set(o,15);
        System.out.println(o);
        System.out.println(age.get(o));

        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
//        name.set(o,"zs");
        name.set(null,"ls");
        System.out.println(o);
        System.out.println(name.get(null));
    }
}

class Student{
    public int age;
    private static String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ",name=" + name +
                '}';
    }
}
