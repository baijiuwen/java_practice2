package com.eb.io.renameTo;

import java.io.File;

public class RenameTo {

    public static void main(String[] args) {

        File old = new File("D:\\file\\1.jpg");
        File newFile = new File("D:\\file\\a\\1.jpg");
        old.renameTo(newFile);
        System.out.println("-----");
    }
}
