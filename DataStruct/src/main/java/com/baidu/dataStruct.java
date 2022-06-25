package com.baidu;

import javax.swing.*;
import java.io.*;
import java.util.Collection;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipOutputStream;

/**
 * @author dyw
 * @date 2022-06-19  10:05
 */
public class dataStruct {
    public static void main(String[] args) throws FileNotFoundException {
        Thread t = new Thread(){
            @Override
            public void run(){
                pong();
            }
        };
        t.run();
        System.out.println("ping");
    }
    static void pong(){
        System.out.println("pong");
    }
}
