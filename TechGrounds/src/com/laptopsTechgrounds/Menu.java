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
                + "8. Sla alle wijzigingen op\n"
                + "9. Beëindig de applicatie.");
        System.out.print("Uw keuze: ");
        choice = scanner.nextByte();

//        if (choice == 1) {
//            LaptopArray lptArr = new LaptopArray();
//            lptArr.showLaptops();
//        }
//        LaptopArray LptArr = new LaptopArray();
        switch (choice) {
            case 1 -> LaptopArray.showLaptops();
            case 2 -> LaptopArray.sortLaptopsAToZ();
            case 3 -> LaptopArray.sortLaptopsZToA();
            case 4 -> LaptopArray.sortLaptopsByPriceHighToLow();
            case 5 -> LaptopArray.sortLaptopsByPriceLowToHigh();
            case 6 -> {
                AddLaptop.addLaptopInput();
                AddLaptop.addLaptop();
            }
            case 7 -> RemoveLaptop.removeLaptop();
            case 8 -> {
                WriteToFile2.writeFile();
                System.out.println("Opgeslagen");
                LaptopArray.backToMainMenu();
            }
            case 9 -> System.out.println("Bedankt voor het gebruiken van TechGrounds Laptops. Tot ziens!");
            default -> {
                System.out.println("\nOngeldige invoer, probeer het nog eens.\n");
//                LaptopArray.backToMainMenu();
                var menu = new Menu();
                menu.menu();
            }
        }
    }
}
