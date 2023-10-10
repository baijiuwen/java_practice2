package com.eb.collection_.map_;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class Map_ {

    @Test
    public void map1(){
        Map<Object,Object> map = new HashMap();
        for (int i = 0; i < 7; i++) {
            map.put(new A(),1);
        }
        for (int i = 0; i < 7; i++) {
            map.put(new B(),1);
        }

    }

}

class A{
    @Override
    public int hashCode() {
        return 1;
    }
}
class B{
    @Override
    public int hashCode() {
        return 2;
    }
}
