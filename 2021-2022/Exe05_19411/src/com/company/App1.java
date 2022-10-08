package com.company;

import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i += 3) {
            System.out.println(i);
        }
    }
}
