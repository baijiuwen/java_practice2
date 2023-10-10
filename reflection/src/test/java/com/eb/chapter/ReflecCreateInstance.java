package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;

class User{
    private int age = 10;
    private String name = "zs";

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public User(int age){
        this.age = age;
    }

    public User() {
    }

    @Override
    public String
    toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

@SpringBootTest
public class ReflecCreateInstance {

    @Test
    public void create()throws Exception{

        Class<?> aClass = Class.forName("com.eb.chapter.User");
        Object o = aClass.newInstance();
        System.out.println(o);

//        Constructor<?> constructor = aClass.getConstructor(int.class);
//        Object o1 = constructor.newInstance(15);
        Object o1 = aClass.getConstructor(int.class).newInstance(15);
        System.out.println(o1);

        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(int.class, String.class);
        declaredConstructor.setAccessible(true); // 暴力破解
        Object ls = declaredConstructor.newInstance(15, "ls");
        System.out.println(ls);
    }
}
