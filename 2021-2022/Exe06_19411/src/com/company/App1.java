package com.company;

import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    int n = input.nextInt();
        int l = input.nextInt();

        for (int d1 = 1; d1 <= n; d1++) {
            for (int d2 = 1; d2 <= n; d2++) {
                for (char l1 = 'a'; l1 < 'a' + l; l1++) {
                    for (char l2 = 'a'; l2 < 'a' + l; l2++) {
                        for (int d3 = Math.max(d1,d2) + 1; d3 <= n; d3++) {
                            System.out.printf("%d%d%c%c%d ",d1,d2,l1,l2,d3);
                        }
                    }
                }
            }
        }
    }
}
