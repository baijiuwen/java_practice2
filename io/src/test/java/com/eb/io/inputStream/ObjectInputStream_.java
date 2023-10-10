package com.eb.io.inputStream;

import com.eb.io.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

@SpringBootTest
public class ObjectInputStream_ {

    @Test
    public void input1() throws Exception{

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:\\file\\data.dat"));

        int i = objectInputStream.read();
        boolean b = objectInputStream.readBoolean();
        String s = objectInputStream.readUTF();
        char c = objectInputStream.readChar();
        double d = objectInputStream.readDouble();
        Object o = objectInputStream.readObject();

        System.out.println(i);
        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(d);
        System.out.println(o);
        System.out.println(o.getClass());
        Dog dog = (Dog)o;
        System.out.println(dog);
        System.out.println(dog.getClass());

        objectInputStream.close();

    }


}
