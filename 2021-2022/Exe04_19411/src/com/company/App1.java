package com.company;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4*n + n; j++) {
                if(i == 1 || i == n){
                    if(j <= 2*n || j > 2*n + n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if(j == 1 || j == 2*n || j == 2*n + n + 1 || j == 4*n + n){
                        System.out.print("*");
                    } else {
                        if(j < 2*n + 1 || j > 2*n + n){
                            System.out.print("/");
                        }else {
                            if(n % 2 == 0 && i == n/2){
                                    System.out.print("|");
                            } else if (n % 2 != 0 && i == n/2 + 1) {
                                    System.out.print("|");
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
