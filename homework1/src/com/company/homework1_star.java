package com.company;

import java.util.Scanner;

public class homework1_star {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;


        System.out.println("Type first value");
        int value1 = input.nextInt();

        System.out.println("Type operation (+,-,*,/)");
        String operation = input.next();

        System.out.println("Type second value");
        int value2 = input.nextInt();
        System.out.println();
        input.close();


        switch (operation) {
            case "+":
                result = value1 + value2;
                break;
            case "-":
                result = value1 - value2;
                break;
            case "*":
                result = value1 * value2;
                break;
            case "/":
                result = value1 / value2;
                break;
            default:
                System.out.println("Wrong operation. Please try again.");
                break;
        }
        System.out.println(value1 + " " + operation + " " + value2 + " = " + result);
    }
}
