package com.company;
import java.util.Scanner;
import static java.lang.System.out;

public class homework1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert numbers to compare ");
        int[] array = new int[3];
        int max = 0;
        int max_index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                max_index = i;
            }
        }
        System.out.println("Maximum number is - " + max);
        input.close();
    }
}

