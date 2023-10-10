package com.eb.io.outputStream;

import com.eb.io.Dog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

@SpringBootTest
public class ObjectOutputStream_ {

    @Test
    public void object1() throws Exception{
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("d:\\file\\data.dat"));

        objectOutputStream.write(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeUTF("aaa");
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(0.003);

        objectOutputStream.writeObject(new Dog("旺财",5));

        objectOutputStream.close();

    }


}
