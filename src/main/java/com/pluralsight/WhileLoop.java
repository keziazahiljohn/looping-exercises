package com.pluralsight;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What do you love? ");
        String love = scanner.nextLine();
        System.out.println("okay watch :)");

        int i = 0;
        while (i < 5) {
            i++;
            System.out.println("I love " + love + "!");
        }
    }
}
