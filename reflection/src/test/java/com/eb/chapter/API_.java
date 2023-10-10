package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;
class A{
    public String hobby;
}
class Person extends A{
    public String name;
    protected int age;
    private double sal;
    String job;
}
@SpringBootTest
public class API_ {


    @Test
    public void api1() throws Exception{
        Class cls = Class.forName("com.eb.chapter.Person");
        System.out.println(cls.getName()); // 全类名
        System.out.println(cls.getSimpleName());// 简单类名

        Field[] fields = cls.getFields();// 获取公有的属性和父类公有属性
        for (Field field : fields) {
            System.out.println("本类和父类的公有属性："+field.getName());
        }

        Field[] declaredFields = cls.getDeclaredFields(); // 获取本类中所有属性
        for (Field declaredField : declaredFields) {
            System.out.println("本类中所有属性："+declaredField.getName());
        }


    }
}
