package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Field;

@SpringBootTest
public class ClassMethod_ {

    @Test
    public void method_() throws Exception{
        Class<?> aClass = Class.forName("com.eb.chapter.Car");
        System.out.println(aClass);
        System.out.println(aClass.getClass());

        System.out.println(aClass.getPackage().getName()); // 包名
        System.out.println(aClass.getName()); // 全类名

        Car car = (Car)aClass.newInstance();  // 创建对象
        System.out.println(car);

        Field field = aClass.getField("color"); // 私有属性需要暴力拿
        System.out.println(field.get(car));

        field.set(car,"blue"); // 修改变量
        System.out.println(field.get(car));

        System.out.println("所有字段属性");
        Field[] fields = aClass.getFields();
        for (int i = 0 ;i<fields.length;i++){
            System.out.println(fields[i]);
        }
    }
}
