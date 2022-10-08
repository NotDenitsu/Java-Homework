package com.company;

import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int n = input.nextInt();

        for (int i = 1; i <= n + 2 * (n / 2); i++) {
            if (i <= n) {
                System.out.print(generateString('_', 3 * n) + "*" + generateString('_', a) + "*" + generateString('_', (n * 5) - (n * 3 + 2) - a));
                a++;
            } else if (i <= n + n / 2) {
                System.out.print(generateString('*', n * 3 + 1) + generateString('_', a - 1) + "*" + generateString('_', (n * 5) - (n * 3 + 2) - (a - 1)));
            } else if (i > n + n / 2 && i < n + 2 * (n / 2)) {
                System.out.print(generateString('_', 3 * n - c) + "*" + generateString('_', (a-1) + b) + "*" + generateString('_', (n * 5) - (n * 3 + 2) - a - c + 1));
                c++;
                b += 2;
            } else if (i == n + 2 * (n / 2)) {
                System.out.print(generateString('_', 3 * n - c) + generateString('*', (a-1) + b + 2) + generateString('_', (n * 5) - (n * 3 + 2) - a - c + 1));
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
