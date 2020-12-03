package com.halil;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
//        var calculator = new TaxCalculator2018(100_000);
        var report = new TaxReport();
//        System.out.println(calculator.calculateTax());
        report.show(new TaxCalculator2018(100_000));
//        report.setCalculator(new TaxCalculator2019());
        report.show(new TaxCalculator2019());

//        var point1 = new Point(1,2);
//        var point2 = new Point(1,2);
//        System.out.println(point1.hashCode());
//        System.out.println(point2.hashCode());

//        UIControl[] controls = { new TextBox(), new CheckBox()};
//        for (var control : controls) {
//            control.render();
//        }

//        var control = new UIControl(true);
//        var textBox = new TextBox();
//
////        show(control);
//        show(textBox);
//        var employee2 = new Employee(30_000);
//        var employee = new Employee(50_000, 20);
//        Employee.printNumberOfEmployees();
////        System.out.println(Employee.numberOfEmployees);
//

//        int wage = employee.calculateWage();
//        System.out.println(wage);

//        var textBox = new TextBox();


//        System.out.println("Base Salary: "+ baseSalary +" Hourly rate: " + employee.getHourlyRate()  );


//        var browser = new Browser();
//        browser.navigate("www.mosh.com");

    }

//    public static void show(UIControl control) {
//        System.out.println(control);
//    }
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