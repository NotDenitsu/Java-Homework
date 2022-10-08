package com.company;

import javax.swing.*;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        boolean Switch = false;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0; i < 2 * (n - 2) + 1; i++) {
            if(!Switch && i != (2 * (n - 2) + 1)/2){
                System.out.println(generateString('*',n-2) + ((i < (2 * (n - 2) + 1)/2) ? "\\ " + "/" : "/ " + "\\") + generateString('*',n-2));
                Switch = true;
            } else if (Switch && i != (2 * (n - 2) + 1)/2){
                System.out.println(generateString('-',n-2) + ((i < (2 * (n - 2) + 1)/2) ? "\\ " + "/" : "/ " + "\\") + generateString('-',n-2));
                Switch = false;
            } else if (i == (2 * (n - 2) + 1)/2){
                System.out.println(generateString(' ', n-1) + "@");
                Switch = false;
            }
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
