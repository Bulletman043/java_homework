package com.company;



import java.util.Scanner;

public class homework1_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type number");
        int number = input.nextInt();
        if (number%2==0){
            System.out.println(number + " - It's an even number");
        }
        else{
            System.out.println(number + " -  It's an odd number");
        }
        input.close();
    }
}
