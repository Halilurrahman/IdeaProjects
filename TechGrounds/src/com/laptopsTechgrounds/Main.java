package com.laptopsTechgrounds;

public class Main {

    private static int startingApp = 0;

    public static void main(String[] args) {

        if (startingApp == 0) {
//            LaptopArray.readLaptops();

            WriteToFile2.readFile();
            startingApp++;
//           zorgt ervoor dat de laptops eenmalig worden ingeladen voor aanvang van programma
        }
        var menu = new Menu();
        menu.menu();
    }
}
