package com.company;

import java.util.Scanner;

public class homework1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type 1st number ");
        int number1 = scan.nextInt();

        System.out.print("Type 2nd number ");
        Scanner scan2 = new Scanner(System.in);
        int number2 = scan.nextInt();

        System.out.println(number1 - number2);
        scan.close();
    }

}
