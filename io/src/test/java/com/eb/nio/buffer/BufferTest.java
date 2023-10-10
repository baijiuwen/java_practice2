package com.eb.nio.buffer;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.nio.ByteBuffer;

/**
 * @auth:
 * @date: 2023/7/4
 */
@SpringBootTest
public class BufferTest {

    @Test
    public void ByteBuffer(String[] args) {
        //1、分配一个指定大小的缓冲区
        ByteBuffer buffer = ByteBuffer.allocate(1024);

        System.out.println("----------- allocate() -----------");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        //2、将数据写入到缓冲区
        String str = "abcdef";
        buffer.put(str.getBytes());

        System.out.println("-------- put() --------");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        //3、切换读取数据方式
        buffer.flip();
        System.out.println("-------- flip() --------");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        //4、读取缓冲区的数据
        byte[] dst = new byte[buffer.limit()];
        System.out.println("-------- get() --------");
        buffer.get(dst);
        System.out.println(new String(dst, 0, dst.length));
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        //5、reset()：将位置 position 转到以前设置的 mark 所在的位置
        System.out.println("-------- reset() --------");
        buffer.flip();
        buffer.mark();  //对缓冲区设置标记
        byte[] b = new byte[buffer.limit()];
        buffer.get(b);
        System.out.println(new String(b, 0, b.length));
        System.out.println("使用reset()方法之前，position = " + buffer.position());
        buffer.reset();  //将位置 position 转到以前设置的 mark 所在的位置
        System.out.println("使用reset()方法之后，position = " + buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        //6、rewind()：可重复读,将位置设为为 0
        buffer.rewind();
        System.out.println("-------- rewind() --------");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());

        //7、clear()：清空缓冲区，缓冲区的数据依然存在
        buffer.clear();
        System.out.println("-------- clear() --------");
        System.out.println(buffer.position());
        System.out.println(buffer.limit());
        System.out.println(buffer.capacity());
        System.out.println((char) buffer.get());  //数据依然存在
    }
}