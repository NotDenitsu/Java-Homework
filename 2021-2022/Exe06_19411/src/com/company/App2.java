package com.company;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int d1 = 0; d1 < 9; d1++) {
            for (int d2 = 0; d2 < 9; d2++) {
                for (int d3 = 0; d3 < 9; d3++) {
                    for (int d4 = 0; d4 < 9; d4++) {
                        for (int d5 = 0; d5 < 9; d5++) {
                            for (int d6 = 0; d6 < 9; d6++) {
                                if(d1 * d2 * d3 * d4 * d5 * d6 == n){
                                    System.out.printf("%d%d%d%d%d%d",d1,d2,d3,d4,d5,d6);
                                    System.out.println();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
