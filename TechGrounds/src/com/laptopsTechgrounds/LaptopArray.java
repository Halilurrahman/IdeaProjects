package com.laptopsTechgrounds;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LaptopArray {


   private static List<Laptop> listOfLaptops = new ArrayList<Laptop>();



//    public static void main(String[] args) {
//        listOfLaptops.add(new Laptop("Dell", "XS-550", 500));
//        listOfLaptops.add(new Laptop("Windows", "Surface", 800));
//        listOfLaptops.add(new Laptop("Acer", "MK-50", 780));
//        listOfLaptops.add(new Laptop("MSI", "GAMER", 1200));
//        listOfLaptops.add(new Laptop("Lenovo", "X", 900));
//        listOfLaptops.add(new Laptop("Dell", "XS-650", 600));
//    }

//    private static Scanner scanner;


//        sortLaptopsAToZ();
//        sortLaptopsZToA();
//        sortLaptopsByPriceLowToHigh();
//        sortLaptopsByPriceHighToLow();
//        showLaptops();
//

    //    }
    public static void readLaptops() {

        listOfLaptops.add(new Laptop("Lenovo", "Legion 5" , 1200));
        listOfLaptops.add(new Laptop("Dell", "XS-550", 500));
        listOfLaptops.add(new Laptop("Windows", "Surface", 800));
        listOfLaptops.add(new Laptop("Acer", "MK-50", 780));
        listOfLaptops.add(new Laptop("MSI", "GAMER", 1200));
        listOfLaptops.add(new Laptop("Lenovo", "X", 900));
        listOfLaptops.add(new Laptop("Dell", "XS-650", 600));
    }

    public static void showLaptops() {

//        LaptopArray.readLaptops();
        for (Laptop str : listOfLaptops) {
            System.out.println(str);
        }
        LaptopArray.backToMainMenu();
    }

    public static void sortLaptopsByPriceLowToHigh() {
//        LaptopArray.readLaptops();
        System.out.println("Sort by Price low --> high\n");
        Collections.sort(listOfLaptops, Laptop.SortLaptopByPriceLowToHigh);
        for (Laptop str : listOfLaptops) {
            System.out.println(str);
        }
        LaptopArray.backToMainMenu();
    }

    public static void sortLaptopsByPriceHighToLow() {
//        LaptopArray.readLaptops();
        System.out.println("Sort by Price high --> low\n");
        Collections.sort(listOfLaptops, Laptop.SortLaptopByPriceHighToLow);
        for (Laptop str : listOfLaptops) {
            System.out.println(str);
        }
        LaptopArray.backToMainMenu();
    }
    /*Sorting based on Student Name*/

    public static void sortLaptopsAToZ() {
//        LaptopArray.readLaptops();
        System.out.println("Sort by brand A-->Z:\n");
        Collections.sort(listOfLaptops, Laptop.BrandComparatorAToZ);

        for (Laptop str : listOfLaptops) {
            System.out.println(str);
        }
        LaptopArray.backToMainMenu();
    }

    public static void sortLaptopsZToA() {
//        LaptopArray.readLaptops();
        System.out.println("Sort by brand Z-->A:\n");
        Collections.sort(listOfLaptops, Laptop.BrandComparatorZToA);

        for (Laptop str : listOfLaptops) {
            System.out.println(str);
        }
        LaptopArray.backToMainMenu();
    }

    public static void backToMainMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press enter to return to main menu");
        String backToMenu = scanner.nextLine();
        var menu = new Menu();
        menu.menu();
    }
    public static List<Laptop> getListOfLaptops() {
        return listOfLaptops;
    }
    public static void setListOfLaptops(List<Laptop> listOfLaptops) {
        LaptopArray.listOfLaptops = listOfLaptops;
    }
}

