package com.eb.chapter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GetClass_ {

    @Test
    public void get_() throws Exception{
        // 1
        Class<?> car1 = Class.forName("com.eb.chapter.Car");
        System.out.println(car1);
        // 2
        Class car2 = Car.class;
        System.out.println(car2);
        // 3
        Car car = new Car();
        Class car3 = car.getClass();
        System.out.println(car3);
        // 4
        ClassLoader classLoader = car.getClass().getClassLoader();
        Class<?> car4 = classLoader.loadClass("com.eb.chapter.Car");
        System.out.println(car4);

        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
        System.out.println(car4.hashCode());

        // 5
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        // 6
        Class<Integer> type = Integer.TYPE;
        Class<Double> type1 = Double.TYPE;
    }
}
