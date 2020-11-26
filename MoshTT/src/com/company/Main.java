package com.company;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//        int myAge= 30;
//        int herAge=myAge;
//        byte age= 21;
//long viewsCount = 123_463_213_332L;
//long peopleOnEarth = 7_555_555_555L;
//float price = 10.99F;
//char letter = 'A';
//boolean isEligable = true;
//        Date now = new Date();
//byte x = 3;
//byte y = x;
//x = 5;
//        Point point1 = new Point(1, 1);
//        Point point2 = point1;
//        point1.x = 3;
//
//        String message = " c:\\windows\\...  " + "!!";
//        int[][] numbers = {{1,2,3},{674,4,7}};

//        numbers[0][0] = 1;
//        numbers[2] = 2;
//        numbers[4] = 8;

// System.out.println(message.trim()
//Arrays.sort(numbers);
// );
//        final float PI = 3.14F;
//        double sum = 10 / (double)3;
//        String d = "1";
//        int x = Integer.parseInt(d)+ 3;
//          int result = (int)(Math.random()*100);
//        String price =NumberFormat.getPercentInstance().format(0.45);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(scanner);

        /* mortgage calculator
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.println(principal);
        System.out.print("Annual Interest rate: ");
        double interest = scanner.nextDouble();
        System.out.println(interest);
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        System.out.println(years);
        double mortgageRaw = principal*(((interest/1200)*Math.pow((1+interest/1200),(years*12)))/(Math.pow((1+interest/1200),(years*12))-1));
        String mortgage = NumberFormat.getCurrencyInstance().format(mortgageRaw);
        System.out.println("Mortgage: $" + mortgage + " per month"  );*/


////        int temperature = 2;
//        boolean isWarm = temperature > 20 && temperature < 30;
//
//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
//        int temp = 15;
//        System.out.println("it's " + temp + " degrees");
//        if (temp > 30) {
//            System.out.println("Its a hot day");
//            System.out.println("Drink plenty of water");
//        } else if (temp > 20)
//            System.out.println("its a nice day");
//        else
//            System.out.println("its a cold day");

//int schotkracht = 70;
//      String eredivisieWaardig = schotkracht > 75 ? "Zeker Eredivisiewaardig" : "Keuken Kast Kampioenschap";
//        System.out.println(eredivisieWaardig);

//        String role = "admin";
//        switch (role) {
//
//            case "admin":
//                System.out.println("You are an admin");
//                break;
//            case "user":
//                System.out.println("You are an user");
//                break;
//            default:
//                System.out.println("you are nothing");
//
//        }

//        int numb = 15;

//    boolean numberDivisableByFive = numb % 5 == 0;
//        if (numb%5 == 0 && numb%3 != 0)
//        {
//            System.out.println("Fizz");
//        }
//        else if(numb%3 == 0 && numb%5 != 0)
//            System.out.println("Buzz");
//        else if(numb%5 == 0 && numb%3 == 0)
//            System.out.println("FizzBuzz");
//        else
//            System.out.println(numb);

//        for (int i = 0; i < 5; i++) {
//            System.out.println("AllaahoeAkbar");
//            System.out.println("test for github");
//        }
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//
//        while (!input.equals("quit")) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);

//do {
//    System.out.print("Input: ");
//    input = scanner.next().toLowerCase();
//    System.out.println(input);
//} while (!input.equals("quit"));


//        String[] nintendoConsoles = {"Wii","Switch","N64","Gamecube","Snes","Nes"};
//
////        for(int i =0; i < nintendoConsoles.length ; i++)
////            System.out.println(nintendoConsoles[i]);
//
//        for (String nintendoConsole: nintendoConsoles) {
//            System.out.println(nintendoConsole);
//
//        }

public class Main implements Execute {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal(between $1K and $1M): ");
//        principal = scanner.nextInt();
//        while (principal < 1000 || principal > 1000000) {
//
//            System.out.println("number is invalid, enter between 1000 and 1000000");
//            System.out.print("Principal(between $1K and $1M): ");
//            principal = scanner.nextInt();
//        }
////        int principal = scanner.nextInt();
//        System.out.println(principal);
//        System.out.print("Annual Interest rate(between 0 and 30: ");
//        double interest = scanner.nextDouble();
//
//        while (interest <= 0 || interest >= 30) {
//            System.out.println("invalid interest rate, must be higher than 0 and lower than 30");
//            System.out.print("Annual Interest rate(between 0 and 30: ");
//            interest = scanner.nextDouble();
//        }
//        System.out.println(interest);
//        System.out.print("Period (Years between 1 and 30): ");
//        byte years = scanner.nextByte();
//        while (years < 1 || years > 30) {
//            System.out.println("invalid years, must be equal or higher than 1 and equal or lower than 30");
//            System.out.print("Period (Years between 1 and 30): ");
//            years = scanner.nextByte();
//        }
//        System.out.println(years);

//        System.out.println("Principal: " + principal + " - Interest: " + interest + " - Years: " + years);
        int principal = (int) checkInputParameters("Principal amount(between $1K and $1M): ", 1000, 1000000);
        double interest = checkInputParameters("Annual Interest rate(between 0 and 30: ", 0, 30);
        byte years = (byte) checkInputParameters("Period (Years between 1 and 30): ", 1, 30);

        printMonthlyAmoutTPayAndPayments(principal, interest, years);
    }

    private static void printMonthlyAmoutTPayAndPayments(int principal, double interest, byte years) {
        System.out.println("Principal: " + principal + " - Interest: " + interest + " - Years: " + years);
        System.out.println("-----------------------------------------------------------");

        String resultCalculatedMortgage = calculateMortgage(principal, interest, years);
        System.out.println("Your monthly rate is: " + resultCalculatedMortgage);

        System.out.println("-----------------------------------------------------------");
        System.out.println("Amount left to pay:");
        System.out.println(payments(principal, interest, years));
    }


    public static double checkInputParameters(String inputText, int lowerParameterBorder, int higherParameterBorder) {
        Scanner scanner = new Scanner(System.in);
        double inputValue;
        System.out.print(inputText);
        inputValue = scanner.nextDouble();
        while (inputValue < lowerParameterBorder || inputValue > higherParameterBorder) {
            System.out.println("number is invalid, enter a value between " + lowerParameterBorder + " and " + higherParameterBorder);
            System.out.print(inputText);
            inputValue = scanner.nextInt();
        }
        System.out.println("-----------------------------------------------------------");
        return inputValue;
    }


    public static String calculateMortgage(int principal, double interest, byte years) {
        double mortgageRaw = principal * (((interest / 1200) * Math.pow((1 + interest / 1200), (years * 12)))
                /
                (Math.pow((1 + interest / 1200), (years * 12)) - 1));

        String mortgage = NumberFormat.getCurrencyInstance().format(mortgageRaw);
        return mortgage;
    }

    public static String payments(int principal, double interest, byte years) {
        double amountLeftMortgage=0;
        String amountLeftToPay= "";
        for (int i = 0; i <= (years * 12); i++) {
             amountLeftMortgage = principal * ((Math.pow((1 + interest / 1200), (years * 12)) - Math.pow((1 + interest / 1200), (i)))
                    /
                    (Math.pow((1 + interest / 1200), (years * 12)) - 1));

            System.out.println("Month: " + i + " = " + NumberFormat.getCurrencyInstance().format(amountLeftMortgage));

        }

        return amountLeftToPay;
    }
}




