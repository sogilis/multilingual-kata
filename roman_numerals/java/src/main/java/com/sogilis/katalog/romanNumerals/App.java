/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.sogilis.katalog.romanNumerals;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        if (!input.isEmpty()) {
            System.out.println(input.length());
        }
    }
}