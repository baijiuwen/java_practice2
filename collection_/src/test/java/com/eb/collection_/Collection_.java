package com.eb.collection_;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
public class Collection_ {

    @Test
    public void c1(){
        List list = new ArrayList<>();
        list.add("abc");
        list.add("abc");
        list.add("abc");
        list.add("abc");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

    @Test
    public void c2(){

        List<Book> list = new ArrayList<>();
        list.add(new Book("红楼梦",100));
        list.add(new Book("西游记",10));
        list.add(new Book("水浒传",9));
        list.add(new Book("三国演义",80));
        list.add(new Book("西游记",10));

        int listSize = list.size();
        for (int i = 1 ; i< listSize;i++){
            for (int j = 0 ; j < listSize-i;j++){
                Book book = list.get(j);
                Book book1 = list.get(j + 1);
                if (book.getManey() > book1.getManey()){
                    list.set(j+1,book);
                    list.set(j,book1);
                }
            }
        }
        for (Book book : list){
            System.out.println(book);
        }

        list = new ArrayList<>();
        list.add(new Book("红楼梦",100));
        list.add(new Book("西游记",10));
        list.add(new Book("水浒传",9));
        list.add(new Book("三国演义",80));
        list.add(new Book("西游记",10));
        for (int i = 1; i < list.size(); i++) {
            int index = 0;
            for (int j = list.size() - i; j > 0; j--) {
                Book book = list.get(index);
                Book book1 = list.get(index+1);
                if (book.getManey() > book1.getManey()){
                    list.set(index+1,book);
                    list.set(index,book1);
                }
                index++;
            }
        }
        for(Book book : list){
            System.out.println(book);
        }


    }


}

class Book{
    private String name;
    private int maney;

    public Book() {
    }

    public Book(String name, int maney) {
        this.name = name;
        this.maney = maney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManey() {
        return maney;
    }

    public void setManey(int maney) {
        this.maney = maney;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", maney=" + maney +
                '}';
    }
}
