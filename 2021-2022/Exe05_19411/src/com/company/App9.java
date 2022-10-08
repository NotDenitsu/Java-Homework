package com.company;

import java.util.Scanner;

public class App9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;

        do {
            sum = sum + (n % 10);
            n = n / 10;
        } while (n > 0);

        System.out.println(sum);
    }
}
