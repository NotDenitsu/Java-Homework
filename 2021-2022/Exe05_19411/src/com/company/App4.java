package com.company;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num = 1;

        for (int i = 0; i <= n; i += 2) {
            System.out.println(num);
            num = num * 2 * 2;
        }
    }
}
