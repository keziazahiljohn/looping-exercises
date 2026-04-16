package com.pluralsight;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("What do you love? ");
        String love = myScanner.nextLine();
        System.out.println("Watch this");

        int i = 0;
        do {
            System.out.println("I love " + love + "!");
            i++;
        } while (i < 5);

    }
}
