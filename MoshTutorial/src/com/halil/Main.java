package com.halil;

public class Main {

    public static void main(String[] args) {
//	String message = greetUser("Halil", "Bagci");
//	greetUser("Borja","Neuman");
//	greetUser("Jouke", "van Leeuwen");
        System.out.println(greetUser("Halil", "Bagci"));

    }
    public static String greetUser(String firstName, String lastName){

        return "hello " + firstName + " " + lastName;

    }
}
