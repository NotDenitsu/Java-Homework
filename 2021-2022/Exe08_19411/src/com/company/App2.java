package com.company;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        String[] input = new Scanner(System.in).nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
            System.out.print((numbers[i] % 2 != 0) ? numbers[i] + " " : "");
        }
    }
}
