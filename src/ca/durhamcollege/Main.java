/*
*   Author: Tyler Osborne
*   Date: 2021-11-09
 */


package ca.durhamcollege;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String name = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        System.out.printf("You Entered: %s",name);

    }
}
