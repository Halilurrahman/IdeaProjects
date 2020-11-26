package com.laptopsTechgrounds;

import java.util.Scanner;

public class AddLaptop extends LaptopArray {

    private static String brandAddedLaptop;
    private static String modelAddedLaptop;
    private static int priceAddedLaptop;

    public static void main(String[] args) {

    }

    public static void addLaptopInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wat is het merk van de laptop?: ");
        brandAddedLaptop = scanner.nextLine();
        System.out.print("Wat is het model van de laptop?: ");
        modelAddedLaptop = scanner.nextLine();
        System.out.print("Wat is de prijs van de laptop?: ");
        priceAddedLaptop = scanner.nextInt();



    }

    public static void addLaptop() {
        var listOfLaptops = LaptopArray.getListOfLaptops();
        listOfLaptops.add(new Laptop(brandAddedLaptop, modelAddedLaptop, priceAddedLaptop));
        setListOfLaptops(listOfLaptops);
        System.out.println("Je hebt een "+ modelAddedLaptop+" laptop van " + brandAddedLaptop + " toegevoegd die $"+priceAddedLaptop+" waard is.\n");
        LaptopArray.backToMainMenu();
    }
}
