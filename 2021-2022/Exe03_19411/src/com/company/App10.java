package com.company;

import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();
        int m = n - (n - 1);
        String symbol = "$ ";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(symbol);
            }
            m++;
            System.out.println();
        }
    }
}
