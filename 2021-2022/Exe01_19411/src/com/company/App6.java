package com.company;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNumber = input.nextInt();
            sum += currentNumber;
        }

        System.out.println(sum);
    }
}
