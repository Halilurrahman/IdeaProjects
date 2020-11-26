package com.laptopsTechgrounds;

import java.util.List;
import java.util.Scanner;

public class RemoveLaptop extends LaptopArray{
   private static List listOfLaptops = LaptopArray.getListOfLaptops();
   private static byte nrOfLaptopToRemove;

    public static void removeLaptop() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listOfLaptops.size(); i++) {
            System.out.println("nr "+(i+1)+" "+listOfLaptops.get(i));
        }
        System.out.print("Vul het nummer in van de te verwijderen laptop(vul 0 in om terug te gaan naar het hoofdmenu):");
        nrOfLaptopToRemove = scanner.nextByte();
        if (nrOfLaptopToRemove==0){
//            LaptopArray.backToMainMenu();
            var menu = new Menu();
            menu.menu();
        }
        System.out.println("De volgende laptop wordt verwijderd:\n"+listOfLaptops.get(nrOfLaptopToRemove-1));
        listOfLaptops.remove(nrOfLaptopToRemove-1);
        setListOfLaptops(listOfLaptops);
        LaptopArray.backToMainMenu();
    }
}
