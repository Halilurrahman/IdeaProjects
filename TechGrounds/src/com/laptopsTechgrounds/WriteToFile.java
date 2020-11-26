package com.laptopsTechgrounds;

import java.io.File;
import java.util.*;

public class WriteToFile {
    public static File laptops = new File("C:\\Users\\halil\\IdeaProjects\\TechGrounds\\src\\com\\laptopsTechgrounds\\Laptops.txt");

    public static void main(String[] args) {
        final Formatter formatter;

//        if (laptops.exists())
//            System.out.println(laptops.getName() + " exists");
//        else
//            System.out.println("File does not exist.");

        try {
            formatter = new Formatter("halil.txt");
            System.out.println("You created a file");
        }catch(Exception e){
            System.out.println("You have an error");

        }
    }
//public void printText(){
//   }


}
