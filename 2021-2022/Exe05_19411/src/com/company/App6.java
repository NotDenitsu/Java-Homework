package com.company;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        while(n < 1 || n > 100){
            System.out.println("Invalid number!");
            n = input.nextInt();
        }

        System.out.println("The number is: " + n);

    }
}
