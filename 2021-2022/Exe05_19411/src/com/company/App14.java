package com.company;

import java.util.Scanner;

public class App14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int num = 1 + row + col;

                if (num > n){
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
