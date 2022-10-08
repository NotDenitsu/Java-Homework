package com.company;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        if(text.length() % 2 == 0){
            text += "_";
        }
        int width = 0, sideDots = 1;
        int n = input.nextInt();

        for (int i = 0; i < n * 2 + 2; i++) {
            //Първа половина
            if(i == 0 && i < 2 * n - (n - 1)){
                System.out.print(generateString('.',n + sideDots) + generateString('_', (n * 2) + 1) + generateString('.',n + sideDots));
                sideDots--;
            } else if (i < 2 * n - (n - 1)) {
                System.out.print(generateString('.',n + sideDots) + "//" + generateString('_', ((n * 2) - 1) + width) + "\\\\" + generateString('.',n + sideDots));
                sideDots--;
                width += 2;
            }
            //Среда

            if (i == 2 * n - (n - 1)){
                System.out.print(generateString('.',n + sideDots) + "//" + generateString('_', (((n * 2) - 1) + width)/2 - text.length()/2) + text + generateString('_', ((((n * 2) - 1) + width))/2 - text.length()/2) + "\\\\" + generateString('_',n + sideDots));
            }

            //Втора половина
            if(i > 2 * n - (n - 1)){
                System.out.print(generateString('.',n + sideDots) + "\\\\" + generateString('_', ((n * 2) - 1) + width) + "//" + generateString('.',n + sideDots));
                sideDots++;
                width -= 2;
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