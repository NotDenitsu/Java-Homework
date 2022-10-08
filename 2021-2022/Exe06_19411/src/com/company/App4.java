package com.company;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int d1 = 1; d1 <= 9; d1++) {
            for (int d2 = 1; d2 <= 9; d2++) {
                for (int d3 = 1; d3 <= 9; d3++) {
                    for (int d4 = 1; d4 <= 9; d4++) {
                        if(n % d1 == 0 && n % d2 == 0 && n % d3 == 0 && n % d4 == 0){
                            System.out.printf("%d%d%d%d ",d1,d2,d3,d4);
                        }
                    }
                }
            }
        }
    }
}
