package com.company;

import java.util.Scanner;

public class App13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = input.nextInt();
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                if(i * 2 / 2 == j){
                    System.out.print(" | ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
