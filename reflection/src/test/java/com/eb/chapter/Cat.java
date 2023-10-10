package com.eb.chapter;

public class Cat {

    private String name = "Tome";

    public String age = "10";

    public Cat(){
        System.out.println("new Cat");
    }
    public Cat(String name){
        this.name = name;
        System.out.println(name);
    }
    public void hi(){

//        System.out.println("hi  Tome");
    }

    public void hello(){
        System.out.println("hello  Tome");
    }
}
