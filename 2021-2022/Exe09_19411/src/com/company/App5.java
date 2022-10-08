package com.company;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");

        while (numbers.length % 2 != 0) {
            System.out.println("Enter an even amount of numbers: ");
            numbers = input.nextLine().split(" ");
        }

        System.out.println("{" + numbers[numbers.length / 2 - 1] + "," + numbers[numbers.length / 2] + "}");
    }
}