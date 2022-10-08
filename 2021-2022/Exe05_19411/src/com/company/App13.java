package com.company;

import java.util.Scanner;

public class App13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int count = 1;
        int nextLine = 1;

        for (int i = 1; i <= n; i++) {
            if(count <= nextLine){
                System.out.print(i);
                count++;
            } else {
                i--;
                System.out.println();
                nextLine++;
                count = 1;
            }
        }

    }
}
