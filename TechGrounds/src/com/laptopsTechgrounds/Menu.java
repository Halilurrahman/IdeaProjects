package com.laptopsTechgrounds;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    private byte choice;

    public void menu() {

        System.out.println("Welkom bij TechGrounds Laptops, selecteer één van de volgende opties:\n"
                + "1. Weergeef alle producten.\n"
                + "2. Weergeef alle producten gesorteerd op merknaam van a → z.\n"
                + "3. Weergeef alle producten gesorteerd op merknaam van z ← a.\n"
                + "4. Weergeef alle producten gesorteerd op prijs van hoog naar laag.\n"
                + "5. Weergeef alle producten gesorteerd op prijs van laag naar hoog.\n"
                + "6. Voeg een product toe.\n"
                + "7. Verwijder een product.\n"
                + "8. Beëindig de applicatie.");
        System.out.print("Uw keuze: ");
        choice = scanner.nextByte();

//        if (choice == 1) {
//            LaptopArray lptArr = new LaptopArray();
//            lptArr.showLaptops();
//        }
//        LaptopArray LptArr = new LaptopArray();
        switch (choice) {

            case 1:
                LaptopArray.showLaptops();
                break;
            case 2:
                LaptopArray.sortLaptopsAToZ();
                break;
            case 3:
                LaptopArray.sortLaptopsZToA();
                break;
            case 4:
                LaptopArray.sortLaptopsByPriceHighToLow();
                break;
            case 5:
                LaptopArray.sortLaptopsByPriceLowToHigh();
                break;
            case 6:
                AddLaptop.addLaptopInput();
                AddLaptop.addLaptop();
                break;
            case 7:
                RemoveLaptop.removeLaptop();
                break;
            case 8:
                System.out.println("Bedankt voor het gebruiken van TechGrounds Laptops. Tot ziens!");
                break;
            default: {
                System.out.println("\nOngeldige invoer, probeer het nog eens.\n");
//                LaptopArray.backToMainMenu();
                var menu = new Menu();
                menu.menu();
            }
        }
    }
}
