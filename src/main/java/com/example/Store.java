package com.example;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.AbstractDocument.Content;

public class Store {
    
    public static void writeCars(content) {
        try {
            tryWriteCars(null);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public static void tryWriteCars(String content) throws IOException {
        FileWriter fw = new FileWriter("cars.csv");
        fw.write(content);
        fw.close();
    }
}
