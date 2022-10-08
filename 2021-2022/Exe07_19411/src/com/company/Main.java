package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String elements[] = new Scanner(System.in).nextLine().split(" ");
        int numbers[] = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            numbers[i] = Integer.parseInt(elements[i]);
        }

        int min = numbers[0],max = numbers[0],sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max,numbers[i]);
        }

        System.out.println("Min = " + min + "\nMax = " + max + "\nSum = " + sum + "\nAverage = " + (double) sum / numbers.length);
    }
}
