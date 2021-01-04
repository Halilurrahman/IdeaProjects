package com.halil.javaPart3.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() throws InsufficientFundsException {
        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            System.out.println(e.getMessage());

        }
////        FileReader reader = null;
//        try (var reader = new FileReader("file.txt")) {
//
//            var value = reader.read();
//
//        }  catch (IOException e) {
//            System.out.println("Could not read data");
////            e.printStackTrace();
//        }


    }

//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
}
