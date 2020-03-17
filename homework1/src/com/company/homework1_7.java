package com.company;
import java.util.Scanner;
import java.util.stream.IntStream;

import static java.lang.System.in;
import static java.lang.System.out;

public class homework1_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type array size number");
        int size = input.nextInt();
        int [] array = new int[size];
        out.println();
        out.println("type values according to array size number");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        out.println();
        int total = IntStream.of(array).sum();
        out.println("Array sum - " + total);
        input.close();
    }
}

