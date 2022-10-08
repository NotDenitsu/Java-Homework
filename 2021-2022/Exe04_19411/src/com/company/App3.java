package com.company;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = 2;
        int b = 1;
        int c = 0;
        int n = input.nextInt();

        for (int i = 0; i < n/2; i++) {
            if(i == 0){
                System.out.print(generateString('_',n/2 - c) + generateString('*', (n % 2 == 0) ? 2 : 1) + generateString('_',n/2 - c));
                c++;
            } else {
                System.out.print(generateString('_',n/2 - c) + "*" + generateString('_', (n % 2 == 0) ? n - (n - a) : n - (n - b)) + "*" + generateString('_',n/2 - c));
                c++;
                if(n % 2 == 0) a += 2;
                else b += 2;
            }
            System.out.println();
        }
        for (int i = 0; i <= n/2; i++) {
            if(i == n/2){
                System.out.print(generateString('_',n/2 - c) + generateString('*', (n % 2 == 0) ? 2 : 1) + generateString('_',n/2 - c));
                c--;
            } else {
                System.out.print(generateString('_',n/2 - c) + "*" + generateString('_', (n % 2 == 0) ? n - (n - a) : n - (n - b)) + "*" + generateString('_',n/2 - c));
                c--;
                if(n % 2 == 0) a -= 2;
                else b -= 2;
            }
            System.out.println();
        }


    }
    public static String generateString(char ch, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += ch;
        }
        return str;
    }
}