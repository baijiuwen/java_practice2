package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.Serializable;

@SpringBootTest
public class AllTypeClass {

    @Test
    public void all(){

        Class<String> stringClass = String.class;  // 外部类
        Class<Serializable> serializableClass = Serializable.class; // 接口
        Class<Integer[]> aClass = Integer[].class; // 数组
        Class<Deprecated> deprecatedClass = Deprecated.class; // 注解
        Class<Thread.State> stateClass = Thread.State.class;// 枚举
        Class<Long> longClass = long.class; // 基本数据类型
        Class<Void> voidClass = void.class; // void
        Class<Class> classClass = Class.class; // 类的类
    }
}
