package com.laptopsTechgrounds;


import java.io.File;
//import java.util.*;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import java.util.List;

public class WriteToFile2 {




    public static void main(String[] args) {

    }

    public static void readFile() {

        List listToRead;

        try {
            FileInputStream fi = new FileInputStream(new File("Laptops.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);

            listToRead = (List) oi.readObject();
            LaptopArray.setListOfLaptops(listToRead);

            oi.close();
            fi.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        List listToWrite = LaptopArray.getListOfLaptops();
        try {
            FileOutputStream f = new FileOutputStream(new File("Laptops.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(listToWrite);

            o.close();
            f.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error initializing stream");
        }
    }

}











