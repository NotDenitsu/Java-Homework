package com.company;

import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = 1;

        while(k <= n){
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
