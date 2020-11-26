package com.halil;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
        var employee2 = new Employee(30_000);
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
//        System.out.println(Employee.numberOfEmployees);


        int wage = employee.calculateWage();
        System.out.println(wage);


//        System.out.println("Base Salary: "+ baseSalary +" Hourly rate: " + employee.getHourlyRate()  );


//        var browser = new Browser();
//        browser.navigate("www.mosh.com");

    }
}
//
//    }

//    var employee = new Employee(50_000, 20);
//        Employee.printNumberOfEmployees();
//    int wage = employee.calculateWage();
//        System.out.println(wage);


//    var textBox1 = new TextBox();
//        textBox1.setText("box 1");
//                System.out.println(textBox1.text.toUpperCase());
//
//                var textBox2 = textBox1;
//                textBox2.setText("sdgsdfgs");
//                System.out.println(textBox1.text);