package com.company;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 2;
        int b = 2;
        int c = 0;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            if(i < n/2 && n % 2 == 0) {
                System.out.print(generateString('_',(n - a)/2) + generateString('*', n - (n - b)) + generateString('_',(n - a)/2));
                a += 2;
                b += 2;
            } else if (i <= n/2 && n % 2 != 0){
                System.out.print(generateString('_',n/2 - c) + generateString('*', n - (n - (b - 1))) + generateString('_',n/2 - c));
                c++;
                b += 2;
            } else if (i >= n/2) {
                System.out.print("|" + generateString('*',n-2) + "|");
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
