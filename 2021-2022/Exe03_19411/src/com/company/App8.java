package com.company;

import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();
        String symbol = "*";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
