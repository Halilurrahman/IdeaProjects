package com.example.helloworld;

import java.time.Year;

public class Main {

    public static void main(String[] args) {
        int year = Year.now().getValue();
        System.out.println(year);
//        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var mortgageMachine = new PrintMortgage(principal,annualInterest, years);
//
//        mortgageMachine.printMortgage();
//        mortgageMachine.printPaymentSchedule();
//        var obj = new Object();

//        var textBox = new TextBox();
//
//        var control = new UIControl(true);
////        show(control);
////        textBox.disable();
//        show(textBox);
    }

//    public static void show(UIControl control) {
//        var textBox = (TextBox)control;
//        textBox.setText("moeilijk");
//        System.out.println(control);
//    }

}