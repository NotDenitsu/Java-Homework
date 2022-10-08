package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        int b = 0;
        int n = input.nextInt();
        for (int i = 0; i < 2 * n - 1; i++) {
            if(i == 0) System.out.print(generateString('.',n / 2) + generateString('#',n) + generateString('.',n / 2));
            else if(i < n - 1) System.out.print(generateString('.',n / 2) + "#" + generateString('.',n - 2) + "#" + generateString('.',n / 2));
            else if(i == n - 1) System.out.print(generateString('#',n / 2 + 1) + generateString('.',n - 2) + generateString('#',n / 2 + 1));
            else if (i < 2 * n - 2){
                System.out.print(generateString('.',a) + "#" + generateString('.', (n - 2) + 2*(n/2-1) - b) + "#" + generateString('.', a));
                b += 2;
                a++;
            }
            else System.out.println(generateString('.',a) + "#" + generateString('.',a));

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
