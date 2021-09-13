package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("What is the input string?");
            String str = scanner.nextLine().toLowerCase();

            if (str.equals("")) {
                System.out.println("Please input a string.\n");
            }
            else if(str.equals("end")) {
                System.out.println("Good-Bye!\n");
                quit = true;
            }
            else {
                System.out.println(str.substring(0,1).toUpperCase() + str.substring(1, str.length()) + " has " + str.length() + " characters.\n");
            }

        }

    }
}