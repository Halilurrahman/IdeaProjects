package com.example.helloworld;

public class CalculateMortgage  {
    final static byte MONTHS_IN_YEAR = 12;
    final static byte PERCENT = 100;


    public  double calculateMortgage(
            ) {

        float monthlyInterest = PrintMortgage.getAnnualInterest() / PERCENT / MONTHS_IN_YEAR;
        float numberOfPayments = PrintMortgage.getYears() * MONTHS_IN_YEAR;

        double mortgage = PrintMortgage.getPrincipal()
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        return mortgage;
    }
}
