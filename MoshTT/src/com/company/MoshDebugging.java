package com.company;

public class MoshDebugging {

    public static void main(String[] args){
        System.out.println("Start");
        printNumbers(4);
        System.out.println("Finish");
    }
    private static void printNumbers(int input){
        for (int i = 0; i <= input; i++) {
            System.out.println(i);
        }
    }
}
