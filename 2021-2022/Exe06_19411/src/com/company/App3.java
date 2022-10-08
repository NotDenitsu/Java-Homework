package com.company;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int M = input.nextInt();
        int S = input.nextInt();

        for (M = M; M >= N; M--) {
            if(M % 2 == 0 && M % 3 == 0 && M != S){
                System.out.println(M);
            } else if (M % 2 == 0 && M % 3 == 0 && M == S){
                break;
            }
        }
    }
}
