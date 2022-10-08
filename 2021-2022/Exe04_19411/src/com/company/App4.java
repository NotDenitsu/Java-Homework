package com.company;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            if(i == 1) System.out.print("/" + generateString('^', n/2) + "\\" + generateString('_',(n > 4) ? n/2 : 0) + "/" + generateString('^', n/2) + "\\");
            else if (i == n - 1) System.out.print("|" + generateString(' ',n/2 + 1) + generateString('_',(n > 4) ? n/2 : 0) + generateString(' ',n/2 + 1) + "|");
            else if (i == n) System.out.print("\\" + generateString('_', n/2) + "/" + generateString(' ', (n > 4) ? n/2 : 0) + "\\" + generateString('_', n/2) + "/");
            else System.out.print("|" + generateString(' ', n * 2 - 2) + "|");
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
